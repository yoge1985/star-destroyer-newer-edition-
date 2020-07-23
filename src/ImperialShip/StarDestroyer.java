package ImperialShip;

import ShipArmament.Armament;
import ShipHull.Hull;
import ShipOperations.Maneuver;
import ShipOperations.ShipCombat;
import ShipOperations.ShipMovement;
import ShipPropulsion.Propulsion;
import Supporting.Location;

public abstract class StarDestroyer implements Maneuver, ShipMovement, ShipCombat {

    private String shpType = "Star destroyer";
    private String shpName;
    protected String IDNumber;
    private String shpClass;
    private int shpCrew;
    private double shpCost;
    private Hull hull;
    protected Propulsion propulsion;
    protected Armament armament;
    protected Location shpLocation;
    protected int xLocation = Location.getX();
    protected int yLocation = Location.getY();
    protected int zLocation = Location.getZ();
    private int moveRate;
    private static int value;

    public StarDestroyer(String shpType,String shpName, int shpCrew,int xLocation, int yLocation,int zLocation) {
        this.armament = new Armament();
        this.propulsion = new Propulsion();
        this.hull = new Hull();
        this.shpType = shpType;
        this.shpName = shpName;
        this.shpCrew = shpCrew;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.zLocation = zLocation;
        this.moveRate = moveRate;
        value++;
        this.IDNumber = shpName + "-" + String.format("%03d",value);
    }

    public void displayShpInfo(){
        System.out.println(IDNumber);
        System.out.println("Class: " + shpType);
        System.out.println("Current location: " + "[" + xLocation + ":" + yLocation + ":" + zLocation + "]");
    }

    public void navigatesToPosition(String position){

        System.out.println(shpName  + " is a " + shpClass + " star destroyer and is currently enroute to " + position);

    }

    public void orbitsPlanet(String planet){

        System.out.println(shpName + " is a " + shpClass + " star destroyer and is currently orbiting " + planet);

    }

    @Override
    public void moveForward() {
        System.out.println(shpName + " is moving forward ");
        xLocation += moveRate;
        System.out.println("Current X location is " + xLocation);
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

    public void displayPropulsion(){
        propulsion.displayPropulsionSpec();
    }


}


