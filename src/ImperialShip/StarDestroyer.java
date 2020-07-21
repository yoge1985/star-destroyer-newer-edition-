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
    protected Propulsion shpPropulsion;
    protected Armament shpArmament;
    protected Location shpLocation;
    protected int xLocation = Location.getX();
    protected int yLocation = Location.getY();
    protected int zLocation = Location.getZ();
    private int moveRate;

    public StarDestroyer(String shpType, String shpName, String shpClass, int shpCrew, double shpCost, int xLocation, int yLocation, int zLocation, int moveRate) {
        this.shpType = shpType;
        this.shpName = shpName;
        this.shpClass = shpClass;
        this.shpCrew = shpCrew;
        this.shpCost = hull.getTotalHullCost() + shpArmament.getTotalCost() + shpPropulsion.getTotalCost();
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.zLocation = zLocation;
        this.moveRate = moveRate;
    }

    public void displayShpInfo(){

        System.out.println(IDNumber);
        System.out.println("Class: " + shpClass);
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


