package ImperialShip;

import ShipArmament.Armament;
import ShipHull.Hull;
import ShipPropulsion.Propulsion;

public class ImperialClassI extends StarDestroyer {

    private int value = 0;
    private Armament armament;
    private Hull hull;
    private Propulsion propulsion;

    private int moveRate = 1;


    public ImperialClassI( String shpType, String shpName, String shpClass, int shpCrew, double shpCost, int xLocation, int yLocation, int zLocation, int moveRate, Armament armament, Hull hull, Propulsion propulsion, int moveRate1) {
        super(shpType,shpName, shpClass, 7200, shpCost * 1.25, xLocation, yLocation, zLocation, moveRate);
        IDNumber = shpName + " " + String.format("%03d",value++);
    }


    @Override
    public void displayShpInfo() {
        System.out.println(IDNumber);
    }
}
