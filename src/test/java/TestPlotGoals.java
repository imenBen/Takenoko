import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import uqam.inf5153.game.modeles.PlayerBoard;
import uqam.inf5153.game.modeles.Position;
import uqam.inf5153.game.modeles.goals.PlotGoal;
import uqam.inf5153.game.modeles.plots.Plot;

import java.util.ArrayList;

public class TestPlotGoals {

/*


    public ArrayList<Plot> getTiles() {




        ArrayList<Plot> plotList = new ArrayList<Plot>();


        return plotList;
    }

    public Plot getTile(Position position) {

        ArrayList<Plot> plotList = getTiles();
        Plot plot = new Plot();
        for (int i = 0; i <= plotList.size(); i++) {
            if ((plotList.get(i)).getPosition() == position) {
                plot= plotList.get(i);
            }
        }
        return plot;
    }
*/
    PlayerBoard playerBoard;
    PlotGoal goalStraightLine;
    //PlotGoal goalCurvedLine;
    //PlotGoal goalTriangle;
    //PlotGoal goalDiamond;
    ArrayList<Plot> listTiles;

    @Before
    public void setup(){
        playerBoard = new PlayerBoard();
        goalStraightLine = new PlotGoal(PlotGoal.Configurations.STRAIGHT_LINE);
        //goalCurvedLine = new PlotGoal(PlotGoal.Configurations.CURVED_LINE);
       // goalTriangle = new PlotGoal(PlotGoal.Configurations.TRIANGLE);
       // goalDiamond = new PlotGoal(PlotGoal.Configurations.DIAMOND);
        listTiles = new ArrayList<>();
        listTiles.add(plot1);
        listTiles.add(plot2);
        listTiles.add(plot3);
    }

    private Position position1 = new Position(0,0);
    private	Position position2 = new Position(-1,2);
    private	Position position3 = new Position(0,4);
    Plot plot1 = new Plot(position1, "green");
    Plot plot2 = new Plot(position2, "green");
    Plot plot3 = new Plot(position3, "green");


    @Test
    public void cardPointValueTest() {
        assertEquals(2, PlotGoal.getCardPointValue(goalStraightLine));
        //assertEquals(3, PlotGoal.getCardPointValue(goalStraightLine));
       // assertEquals(4, PlotGoal.getCardPointValue(goalStraightLine));
       // assertEquals(4, PlotGoal.getCardPointValue(goalStraightLine));

    }

  /* @Test
    public void goalSatisfied () {

        assertTrue(goal.isConfigSatisfied(playerBoard, PlotGoal.Configurations.STRAIGHT_LINE ));
    }

*/
}
