package ImperialShip;

public class ImperialClassI extends StarDestroyer {

    private int moveRate = 1;


    public ImperialClassI(){

        shpName = "ImperialClassI";
        shpCrew = 7200;
        shpCost = 0; //125% and 175% of the cost of combined total of Hull,Propulsion and Armament

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
