package ImperialShip;

import ShipArmament.Armament;
import ShipHull.Hull;
import ShipPropulsion.Propulsion;

public class ImperialClassI extends StarDestroyer {

    private int value;
    private  Armament armament;
    private  Hull hull;
    private  Propulsion propulsion;
    private double shpCost;

    private int moveRate = 1;


    public ImperialClassI(String shipName,int xLoc,int yLoc,int zLoc){
        super("imperialI", shipName,700,xLoc,yLoc,zLoc);
        value++;
        IDNumber = shipName + " " + String.format("%03d",value);
        this.armament = new Armament();
        this.hull = new Hull();
        this.propulsion = new Propulsion();
        shpCost = armament.getTotalCost() + hull.getTotalHullCost() + propulsion.getTotalCost() * 1.25;
    }


    @Override
    public void displayShpInfo() {
        System.out.println(IDNumber);
        System.out.println("Class: "  shpT);
    }

//    public static double shpCost(){
//       return armament.getTotalCost() + hull.getTotalHullCost() + propulsion.getTotalCost() * 1.25;
//    }
}
