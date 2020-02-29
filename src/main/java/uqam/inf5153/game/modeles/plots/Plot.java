package main.java.uqam.inf5153.game.modeles.plots;

import main.java.uqam.inf5153.game.modeles.Placable;
import main.java.uqam.inf5153.game.modeles.Position;

import java.util.Objects;

public class Plot implements Placable {

	private Position position;

	Plot(){}

	@Override
	public Position getPosition() { return this.position; }

	@Override
	public void setPosition(double x, double y) {
		this.position = new Position(x, y);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Plot)) return false;
		Plot plot = (Plot) o;
		return position.equals(plot.position);
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}
}
