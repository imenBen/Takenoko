package main.java.uqam.inf5153.game.modeles;

import java.util.ArrayList;
import java.util.List;

public interface PlacableList<T extends Placable> {

    public boolean place(T placable);
    public boolean verifyIfPlacable(T placable);

    public ArrayList<Position> getAll();
}
