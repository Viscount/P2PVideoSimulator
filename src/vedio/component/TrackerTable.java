package vedio.component;

import vedio.util.RandomUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jaric Liao on 2015/11/2.
 */
public class TrackerTable {

    private Map<Long, List<Long>> detail;

    public TrackerTable() {
        detail = new HashMap<Long,List<Long>>();
    }

    public List<Long> getPeers(long videoId){
        return detail.get(videoId);
    }

    public List<Long> getPeers(long videoId, int num){
        List<Long> candidate = detail.get(videoId);
        return RandomUtil.randomPickFromArray(candidate, num);
    }

    public void addPeer(long videoId, long peerId){
        if ( detail.containsKey(videoId)){
            List<Long> peerList = detail.get(videoId);
            if( !peerList.contains(peerId) ) peerList.add(peerId);
        }
        else {
            List<Long> peerList = new ArrayList<Long>();
            peerList.add(peerId);
            detail.put(videoId,peerList);
        }
    }
}
