package main.java.uqam.inf5153.game.modeles;

import java.util.Objects;

public class Position {
	
	private double x;
	private double y;
	
	public Position(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX() { return this.x; }
	public double getY() { return this.y; }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Position position = (Position) o;
		return x == position.x &&
				y == position.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}
