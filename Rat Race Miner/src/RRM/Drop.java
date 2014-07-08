package RRM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Item;
import NodePackage.Node;
/**
 *
 * @author Tony Nariksan
 */
public class Drop extends Node<ClientContext>{
    private int logId = 1511;

    public Drop(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.backpack.select().count() == 28;
    }

    @Override
    public void execute() {
        for(Item i : ctx.backpack.id(logId)){
            i.interact("Drop");
        }
    }
    
}
