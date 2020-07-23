package ShipYard;

import ImperialShip.ImperialClassII;
import ShipArmament.Armament;
import ShipHull.Hull;
import ShipPropulsion.Propulsion;

import java.util.ArrayList;

public class ShipYard {

    public static void main(String[] args) {

//       ImperialClassI imperialClassI = new ImperialClassI("jo",3,2,1);
//       imperialClassI.displayShpInfo();
       ImperialClassII another = new ImperialClassII("bob",4,3,2);
       ImperialClassII oneMore = new ImperialClassII("yoel",6,4,6);
       another.displayShpInfo();
       another.displayPropulsion();
//       oneMore.displayShpInfo();
//       oneMore.displayPropulsion();



    }

    //
//    public static ArrayList<StarDestroyer> buildStarDestroyers(int imperial1Count, int imperial2Count, TreeMap registry){
//
//        ArrayList<StarDestroyer> starDestroyers = new ArrayList<>();
//        for (int i = 0; i < imperial1Count; i++){
//            ImperialClassI type1 = new ImperialClassI("bobby");
//            starDestroyers.add(type1);
//        }
//        for (int i = 0; i < imperial2Count; i++){
//            ImperialClassII type2 = new ImperialClassII("tommy");
//            starDestroyers.add(type2);
//        }
//        return starDestroyers;
//
//    }

    //builds a hull object by assembling all components of the Hull object and returns specified number of Hull objects
    public static ArrayList<Hull> buildHull(int hullCount){

        ArrayList<Hull> hullObjects = new ArrayList<>();
        for (int i = 0; i < hullCount; i++){

            Hull hull = new Hull();
            hullObjects.add(hull);

        }
        return hullObjects;
    }
    //builds an Propulsion object by assembling all components of Propulsion and returns specified number of Propulsion
    // objects
    public static ArrayList<Propulsion> buildPropulsion(int propulsionCount){
        ArrayList<Propulsion> propulsionObjects = new ArrayList<>();

        for (int i = 0; i < propulsionCount; i++){
            Propulsion propulsion = new Propulsion();
            propulsionObjects.add(propulsion);
        }
        return propulsionObjects;
    }
    //builds an Armament object by assembling all components of Armament and returns specified number of armament
    // objects
    public static ArrayList<Armament> buildArmament(int armamentCount){
        ArrayList<Armament> armamentObjects = new ArrayList<>();

        for (int i = 0; i < armamentCount; i++){
            Armament armament = new Armament();
            armamentObjects.add(armament);
        }
        return armamentObjects;
    }


}
