package ImperialShip;

import ShipArmament.Armament;
import ShipHull.Hull;
import ShipPropulsion.Propulsion;

public class ImperialClassII extends StarDestroyer {

    private  Armament armament;
    private  Hull hull;
    private  Propulsion propulsion;
    private double shpCost;

    public ImperialClassII(String shpName, int xLoc , int yLoc, int zLoc) {
        super("ImperialII", shpName, 9100, xLoc, yLoc, zLoc);
        this.armament = armament;
        this.shpCost = armament.getTotalCost() + hull.getTotalHullCost() + propulsion.getTotalCost() * 1.75;
        this.armament = new Armament();
        this.propulsion = new Propulsion();
        this.hull = new Hull();
    }

//    private static double shpCost(){
//        return armament.getTotalCost() + hull.getTotalHullCost() + propulsion.getTotalCost() * 1.75;
//    }
}

