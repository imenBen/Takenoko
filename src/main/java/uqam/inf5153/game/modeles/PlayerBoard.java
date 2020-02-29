package main.java.uqam.inf5153.game.modeles;

import java.util.ArrayList;
import java.util.List;

import main.java.uqam.inf5153.game.modeles.goals.Goal;
import main.java.uqam.inf5153.game.modeles.plots.Plot;

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
}
