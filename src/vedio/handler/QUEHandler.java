package vedio.handler;

import peersim.core.Node;
import vedio.message.Message;
import vedio.protocol.DataHolder;
import vedio.protocol.Dispatcher;
import vedio.util.GlobalConfig;
import vedio.util.JsonUtil;

/**
 * Created by Jaric Liao on 2015/11/1.
 */
public class QUEHandler extends Handler{
    @Override
    public void handleMessage(Node node, int protocolID, Message message) {
        long videoId = (long)message.getAdditionalInfo("VideoId");
        long requester = message.getRequester();
        DataHolder dataHolder = (DataHolder)node.getProtocol(Dispatcher.pid_dataholder);
        Message ack_message = new Message(message.getReceiver(),message.getRequester(),"ACK", GlobalConfig.ACK_MESSAGE_SIZE);
        ack_message.setAdditionalInfo("PeerList",dataHolder.getTracker().getPeers(videoId,GlobalConfig.MAX_PEER_NUMBER));
        String json = JsonUtil.toJson(ack_message);
    }
}
