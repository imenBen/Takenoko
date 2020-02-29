package main.java.uqam.inf5153.game.modeles;

import java.util.ArrayList;

public class PieceList implements PlacableList<Piece> {
    private ArrayList<Piece> pieces;

    public PieceList()
    {
        this.pieces = new ArrayList<Piece>();
    }

    @Override
    public boolean place(Piece placable) {
        return false;
    }

    @Override
    public boolean verifyIfPlacable(Piece placable) {
        return false;
    }

    @Override
    public ArrayList<Position> getAll() {
        return null;
    }

}
