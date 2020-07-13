package ShipYard;

import ShipHull.Hull;

public class ShipYard {

    public static void main(String[] args) {

        Hull hull = new Hull();
        int amount = hull.getTotalHullCost();
        System.out.println("AMOUNT = " + amount);
    }

//    public static ArrayList<StarDestroyer> buildStarDestroyers(int classICount, int classIICount, TreeMap registry){
//
//
//    }
//
//    public static ArrayList<Hull> buildHull(int HullCount){
//
//        Hull hull = new Hull();
//
//
//
//    }
//
//    public static ArrayList<Propulsion> buildPropulsion(int propulsionCount){
//
//    }
//
//    public static ArrayList<Armament> buildArmament(int armamentCount){
//
//    }


}
