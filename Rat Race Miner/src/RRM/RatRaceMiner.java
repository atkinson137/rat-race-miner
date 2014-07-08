package RRM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony Nariksan aka mitthey
 */
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;

import NodePackage.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Script.Manifest(name="Rat Race Miner", description="Mines basic rocks.")

public class RatRaceMiner extends PollingScript<ClientContext>{
    private final List<Node> nodes = new ArrayList<>();
    
    @Override
    public void start(){
        System.out.println("Script started");
        nodes.addAll(Arrays.asList(new Chop(ctx), new Bank(ctx)));
    }

    @Override
    public void poll() {
        for(final Node t : nodes){
            if(t.activate()){
                t.execute();
            }
        }
    }
    
}
