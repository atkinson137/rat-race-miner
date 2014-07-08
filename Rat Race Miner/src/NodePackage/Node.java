/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NodePackage;

import org.powerbot.script.ClientAccessor; //methodprovider
import org.powerbot.script.ClientContext; //methodcontext

/**
 *
 * @author Tony Nariksan
 */

public abstract class Node<C extends ClientContext> extends ClientAccessor<C> {
    public Node(C ctx){
        super(ctx);
    }
    
    public abstract boolean activate();
    public abstract void execute();
}