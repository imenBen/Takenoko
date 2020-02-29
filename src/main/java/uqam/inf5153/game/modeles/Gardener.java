package uqam.inf5153.game.modeles;

public class Gardener implements Pion {
	
	private Position position;

	@Override
	public Position getPosition() { return this.position; }

	@Override
	public void setPosition(int x, int y) {
		this.position = new Position(x, y);
	}

}
