package main.java.uqam.inf5153.game.modeles;

import main.java.uqam.inf5153.game.modeles.goals.Goal;
import main.java.uqam.inf5153.game.modeles.plots.Plot;

import java.util.ArrayList;


public class WaterChannelList implements PlacableList<WaterChannel> {

    private ArrayList<WaterChannel> waterChannels;

    public WaterChannelList()
    {
        this.waterChannels = new ArrayList<WaterChannel>();
        WaterChannel waterChannel1 = new WaterChannel(new Position(1,0));
        waterChannels.add(waterChannel1);
        WaterChannel waterChannel2 = new WaterChannel(new Position(-1,0));
        waterChannels.add(waterChannel2);
        WaterChannel waterChannel3 = new WaterChannel(new Position(0.5,1));
        waterChannels.add(waterChannel3);
        WaterChannel waterChannel4 = new WaterChannel(new Position(-0.5,1));
        waterChannels.add(waterChannel4);
        WaterChannel waterChannel5 = new WaterChannel(new Position(0.5,-1));
        waterChannels.add(waterChannel5);
        WaterChannel waterChannel6 = new WaterChannel(new Position(-0.5,-1));
        waterChannels.add(waterChannel6);
    }

    @Override
    public boolean place(WaterChannel waterChannel) {
        if(verifyIfPlacable(waterChannel)){
            waterChannels.add(waterChannel);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean verifyIfPlacable(WaterChannel waterChannel) {
        if(this.waterChannels.contains(waterChannel.getPosition())){
            return false;
        }else {
            boolean valid = false;
            for (WaterChannel i : waterChannels) {
                if (i.getPosition().getX() + 0.5 == waterChannel.getPosition().getX() &&
                        i.getPosition().getY() + 1 == waterChannel.getPosition().getY()) {
                    valid = true;
                } else if (i.getPosition().getX() - 0.5 == waterChannel.getPosition().getX() &&
                        i.getPosition().getY() + 1 == waterChannel.getPosition().getY()) {
                    valid = true;
                } else if (i.getPosition().getX() - 0.5 == waterChannel.getPosition().getX() &&
                        i.getPosition().getY() - 1 == waterChannel.getPosition().getY()) {
                    valid = true;
                } else if (i.getPosition().getX() + 0.5 == waterChannel.getPosition().getX() &&
                        i.getPosition().getY() - 1 == waterChannel.getPosition().getY()) {
                    valid = true;
                }
            }
            return valid;
        }
    }
    @Override
    public ArrayList getAll(){
        ArrayList list = new ArrayList();
        for(WaterChannel p: waterChannels){
            list.add(p.getPosition());
        }
        return list;
    }
}



