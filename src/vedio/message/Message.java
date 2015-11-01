package vedio.message;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jaric Liao on 2015/11/1.
 */
public class Message {
    private long requester;
    private long receiver;
    private long size;
    private String type;
    private Map<String, Object> additionalInfo;

    public Message(long requester, long receiver, String type, long size) {
        this.requester = requester;
        this.receiver = receiver;
        this.type = type;
        this.size = size;
        this.additionalInfo = new HashMap<String,Object>();
    }

    public long getRequester() {
        return requester;
    }

    public void setRequester(long requester) {
        this.requester = requester;
    }

    public long getReceiver() {
        return receiver;
    }

    public void setReceiver(long receiver) {
        this.receiver = receiver;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getAdditionalInfo(String name){
        return this.additionalInfo.get(name);
    }

    public void setAdditionalInfo(String name, Object object){
        this.additionalInfo.put(name,object);
    }
}
