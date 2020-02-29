package uqam.inf5153.game.modeles;

public interface Placable {

	public Position getPosition();
	public void setPosition(int x, int y);
	public default void setPosition(Position position)
	{
		this.setPosition(position.getX(), position.getY());
	}
	
}
