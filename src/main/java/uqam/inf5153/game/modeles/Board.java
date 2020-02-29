package main.java.uqam.inf5153.game.modeles;

import main.java.uqam.inf5153.game.modeles.plots.Plot;

import java.util.ArrayList;


public class Board {

	private PlacableList pieceList;
	private PlacableList plotList;
	private PlacableList waterChannelList;

	public Board() {
		this.pieceList = new PieceList();
		this.plotList = new PlotList();
		this.waterChannelList = new WaterChannelList();

	}

	public boolean placePlot(Placable element, double x, double y) {
		element.setPosition(x,y);
		return plotList.place(element);
	}

	public boolean placeWaterChannel(double x, double y) {
		WaterChannel waterChannel = new WaterChannel(createPosition(x, y));
		return waterChannelList.place(waterChannel);
	}

	public ArrayList<Position> getAllPlot() {
		return plotList.getAll();
	}

	private Position createPosition(double x, double y) {
		Position position = new Position(x, y);
		return position;
	}

}
