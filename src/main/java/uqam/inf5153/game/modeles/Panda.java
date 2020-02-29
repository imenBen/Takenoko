package main.java.uqam.inf5153.game.modeles;

public class Panda implements Piece {

	private Position position;

	@Override
	public Position getPosition() { return this.position; }

	@Override
	public void setPosition(double x, double y) {
		this.position = new Position(x, y);
	}
	
}
