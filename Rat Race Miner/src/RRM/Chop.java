package RRM;


import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;
import NodePackage.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony Nariksan
 */
public class Chop extends Node<ClientContext> {
    private int[] treeIDs = {38787, 38783, 38788, 38782, 38760, 38785, 45798, 38731, 38732, 1281};

    public Chop(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.backpack.select().count() < 28
                && !ctx.objects.select().id(treeIDs).isEmpty()
                && ctx.players.local().animation() == -1;
    }

    @Override
    public void execute() {
        GameObject tree = ctx.objects.nearest().poll();
        if(tree.inViewport()){
            tree.interact("Chop");
        } else {
            ctx.movement.step(tree);
            ctx.camera.turnTo(tree);
        }
    }
    
}
