package ImperialShip;

import ShipArmament.Armament;
import ShipHull.Hull;
import ShipPropulsion.Propulsion;

public class ImperialClassI extends StarDestroyer {

    private Armament armament;
    private Hull hull;
    private Propulsion propulsion;

    private int moveRate = 1;


    public ImperialClassI(String shipName){

        shpName = "ImperialClassI";
        shpCrew = 7200;
        shpCost = armament.getTotalCost() + hull.getTotalHullCost() + propulsion.getTotalCost() * 1.25;
        shpName = shipName;
    }

    //prints to console - moving forward. increments x by 1 (move_rate).

    @Override
    public void moveForward() {
        super.moveForward();
    }

    //prints to console - turning to starboard. increments x by 1/2

    @Override
    public void turnToStarBoard() {
        super.turnToStarBoard();
    }

    //prints to console - turning to port. increments x by 1/2

    @Override
    public void turnToPort() {
        super.turnToPort();
    }
}
