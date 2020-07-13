package ImperialShip;

import ShipArmament.Armament;
import ShipHull.Hull;
import ShipOperations.Maneuver;
import ShipOperations.ShipCombat;
import ShipOperations.ShipMovement;
import ShipPropulsion.Propulsion;
import Supporting.Location;

public abstract class StarDestroyer implements Maneuver, ShipMovement, ShipCombat {

    protected String shpNum;
    protected String shpType = "Star destroyer";
    protected String shpName;
    protected String shpClass;
    protected int shpCrew;
    protected double shpCost;
    protected Hull shpMainHull;
    protected Propulsion shpPropulsion;
    protected Armament shpArmament;
    protected Location shpLocation;
    protected int xLocation = Location.getX();
    protected int yLocation = Location.getY();
    protected int zLocation = Location.getZ();
    protected int moveRate;


    public void displayShpInfo(){

    }

    public void navigatesToPosition(String position){

        System.out.println(shpNum  + " is a " + shpClass + " star destroyer and is currently enroute to " + position);

    }

    public void orbitsPlanet(String planet){

        System.out.println(shpNum + " is a " + shpClass + " star destroyer and is currently orbiting " + planet);

    }

    @Override
    public void moveForward() {
        System.out.println(shpName + " is moving forward ");
        xLocation += moveRate;
        System.out.println(xLocation);
    }

    @Override
    public void fireMainBatteries(String tgt) {

    }

    @Override
    public void fireSecondaryBatteries(String tgts) {

    }

    @Override
    public void turnToStarBoard() {
        System.out.println(shpName + " is turning to starboard");
        xLocation += (moveRate / 2);

    }

    @Override
    public void turnToPort() {
        System.out.println(shpName + " is turning to port");
        xLocation += (moveRate / 2);

    }


}


