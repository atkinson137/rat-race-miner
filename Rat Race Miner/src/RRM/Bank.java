package RRM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import NodePackage.Node;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.ClientContext;
/**
 *
 * @author Tony Nariksan
 */
public class Bank extends Node<ClientContext>{


    public Bank(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.backpack.select().count() == 28;
    }

    @Override
    public void execute() {
        ctx.movement.findPath(nearestTile()).traverse();
    }
    
    private Tile nearestTile(){
        return ctx.bank.nearest().tile();
    }
    
}
