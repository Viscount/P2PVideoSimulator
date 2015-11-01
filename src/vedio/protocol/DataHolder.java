package vedio.protocol;

import peersim.core.Node;
import peersim.edsim.EDProtocol;
import peersim.vector.SingleValueHolder;

/**
 * Created by Jaric Liao on 2015/11/1.
 */
public class DataHolder extends SingleValueHolder implements EDProtocol {

    
    public DataHolder(String prefix) {
        super(prefix);
    }

    @Override
    public void processEvent(Node node, int pid, Object event) {

    }
}
