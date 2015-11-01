package vedio.protocol;

import peersim.config.Configuration;
import peersim.core.Node;
import peersim.edsim.EDProtocol;
import peersim.vector.SingleValueHolder;
import vedio.handler.Handler;
import vedio.handler.HandlerFactory;
import vedio.message.Message;
import vedio.util.JsonUtil;

/**
 * Created by Jaric Liao on 2015/11/1.
 */
public class Dispatcher extends SingleValueHolder implements EDProtocol{

    private static final String PAR_MODE = "mode";
    private static final String PAR_PROT_BANDWIDTH = "bandwidth";
    private static final String PAR_PROT_DATAHOLDER = "dataholder";

    public static int pid_bandwidth;
    public static int pid_dataholder;
    public static String mode;


    public Dispatcher(String prefix) {
        super(prefix);
        pid_bandwidth = Configuration.getPid(prefix+"."+PAR_PROT_BANDWIDTH);
        pid_dataholder = Configuration.getPid(prefix+"."+PAR_PROT_DATAHOLDER);
        mode = Configuration.getString(prefix+"."+PAR_MODE);
    }

    @Override
    public void processEvent(Node node, int pid, Object event) {
        Message message = JsonUtil.toObject((String)event,Message.class);

        Handler handler = HandlerFactory.createHandler(message.getType());
        handler.handleMessage(node,pid,message);

    }
}
