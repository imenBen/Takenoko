package uqam.inf5153.game.modeles;

import java.util.ArrayList;
import java.util.List;

import uqam.inf5153.game.modeles.goals.Goal;
import uqam.inf5153.game.modeles.plots.Plot;

public class PlayerBoard {

	private List<Plot> plots;
	private List<Goal> goals;
	private List<WaterChannel> waterChannels;

	
	public PlayerBoard()
	{
		this.plots = new ArrayList<Plot>();
		this.goals = new ArrayList<Goal>();
		this.waterChannels = new ArrayList<WaterChannel>();
	}

	public List<Plot> getPlotList () {
		return plots;
	}

	public ArrayList<Plot> getTiles() {

		ArrayList<Plot> plotList = new ArrayList<Plot>();
		return plotList;
	}

	public Plot getTile(Position position) {

		ArrayList<Plot> plotList = getTiles();
		Plot plot = new Plot();
		for (int i = 0; i <= plotList.size(); i++) {
			if ((plotList.get(i)).getPosition() == position) {
				plot= plotList.get(i);
			}
		}
		return plot;
	}


}
