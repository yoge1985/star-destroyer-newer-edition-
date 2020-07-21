package ImperialShip;

import ShipArmament.Armament;
import ShipHull.Hull;
import ShipPropulsion.Propulsion;

public class ImperialClassII extends StarDestroyer {

    private Armament armament;
    private Hull hull;
    private Propulsion propulsion;

    public ImperialClassII(String shipName){

        shpClass = "Imperial II";
        shpCrew = 9100;
        shpCost = armament.getTotalCost() + hull.getTotalHullCost() + propulsion.getTotalCost() * 1.75;
        shpName = shipName;

    }

}

