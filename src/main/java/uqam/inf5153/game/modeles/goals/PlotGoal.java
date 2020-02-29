package uqam.inf5153.game.modeles.goals;

import uqam.inf5153.game.modeles.Board;
import uqam.inf5153.game.modeles.PlayerBoard;
import uqam.inf5153.game.modeles.Position;
import uqam.inf5153.game.modeles.plots.Plot;
import java.util.*;
import javafx.util.Pair;

public class PlotGoal extends Goal {

    public enum Configurations {

        STRAIGHT_LINE(2), CURVED_LINE(3), TRIANGLE(4), DIAMOND(4);

        public final int cardPointValue;

        Configurations(int cardPointValue) {
            this.cardPointValue = cardPointValue;
        }
    }

    /*Pour pouvoir retourner les  positions relatives a la premiere afin de valider la configuration*/
    final class RelativePositions {
        private final Position secondPos;
        private final Position thirdPos;
        private final Position forthPos;

       /* public RelativePositions(Position secondPos, Position thirdPos) {
            this.secondPos = secondPos;
            this.thirdPos = thirdPos;
        }*/

        public RelativePositions(Position secondPos, Position thirdPos, Position forthPos) {
            this.secondPos = secondPos;
            this.thirdPos = thirdPos;
            this.forthPos = forthPos;
        }
        public Position getSecondPos() {
            return secondPos;
        }

        public Position getThirdPos() {
            return thirdPos;
        }
        public Position getForthPos() {
            return forthPos;
        }
    }

    private Configurations configurationPlot;
    private String color;
    private Position position;
    private List<Plot> tileList;

    /*
     * Constructeur d'une carte objectif parcelle
     */
    public PlotGoal (Configurations configurationPlot) {
        this.configurationPlot = configurationPlot;
    }

    public static int getCardPointValue(PlotGoal plotGoal) {
        return plotGoal.configurationPlot.cardPointValue;
    }
    /*
     * get configuration parcelles
     */
    public Configurations configurationPlot() {
        return configurationPlot;
    }

   /* @Override
    public boolean isObjectifSatisfied(PlayerBoard playerBoard){

    }
    */


   /*returns the positions to check for each configuration*/
    public RelativePositions  getStraightLineRelativePositions (Position firstPos){
        Position secondPos = new Position(firstPos.getX()-1, firstPos.getY()+2);
        Position thirdPos = new Position(firstPos.getX()-2, firstPos.getY()+4);
        return new RelativePositions(secondPos, thirdPos, null);
    }

    public RelativePositions getCurvedLineRelativePositions (Position firstPos){
        Position secondPos = new Position(firstPos.getX()-1, firstPos.getY()+2);
        Position thirdPos = new Position(firstPos.getX(), firstPos.getY()+4);
        return new RelativePositions(secondPos, thirdPos, null);
    }

    public RelativePositions getTriangleRelativePositions (Position firstPos){
        Position secondPos = new Position(firstPos.getX()+1, firstPos.getY()+2);
        Position thirdPos = new Position(firstPos.getX()+2, firstPos.getY());
        return new RelativePositions(secondPos, thirdPos, null);
    }
    public RelativePositions getDiamondRelativePositions (Position firstPos){
        Position secondPos = new Position(firstPos.getX()-1, firstPos.getY()+2);
        Position thirdPos = new Position(firstPos.getX()+2, firstPos.getY());
        Position forthPos = new Position(firstPos.getX()+1, firstPos.getY()+2);
        return new RelativePositions(secondPos, thirdPos, forthPos);
    }


    /*Checks to see if tiles are in the right configuration */
    public boolean isConfigSatisfied(PlayerBoard playerBoard, Configurations config){
        tileList = playerBoard.getPlotList();
        boolean configSatisfied = false;
        boolean sameColors = false;
        boolean isDiamondObj=false;
       RelativePositions relativePositions = new RelativePositions(new Position (0,0),new Position (0,0),new Position (0,0) );
        for (int i = 0; i <= tileList.size(); i++) {
            Plot firstTile = tileList.get(i);
            Position firstPos = firstTile.getPosition();

            switch(config) {
                case STRAIGHT_LINE:
                    relativePositions = getStraightLineRelativePositions(firstPos);
                    break;
                case CURVED_LINE:
                     relativePositions = getCurvedLineRelativePositions(firstPos);
                    break;

                case TRIANGLE:
                    relativePositions = getTriangleRelativePositions(firstPos);
                    break;

                case DIAMOND:
                    relativePositions = getDiamondRelativePositions(firstPos);
                    isDiamondObj=true;
                    break;

            }

            sameColors = isSameColors (firstTile,
                    playerBoard.getTile(relativePositions.getSecondPos()),
                    playerBoard.getTile(relativePositions.getThirdPos()),
                    playerBoard.getTile(relativePositions.getForthPos()),
                    isDiamondObj);
        }
        return configSatisfied && sameColors;
    }

    /*Compares tile colors */
    public boolean isSameColors(Plot firstTile,Plot secondTile,Plot thirdTile ,Plot forthTile , boolean isDiamondObj) {

        if (isDiamondObj) {
            if (firstTile.getColor().equals(secondTile.getColor()) && thirdTile.getColor().equals(forthTile.getColor())) {
                return true;
            } else return false;
        }

        else {
            if (firstTile.getColor().equals(secondTile.getColor())
                    && secondTile.getColor().equals(thirdTile.getColor())) {
                return true;
            } else return false;
        }
    }

}
