package ShipYard;

import ImperialShip.ImperialClassI;
import ImperialShip.ImperialClassII;
import ImperialShip.StarDestroyer;
import ShipArmament.Armament;
import ShipArmament.HeavyIonCannon;
import ShipArmament.TurboLaserCannon;
import ShipHull.*;
import ShipPropulsion.HyperDrive;
import ShipPropulsion.IonEngine;
import ShipPropulsion.Propulsion;

import java.util.ArrayList;
import java.util.TreeMap;

public class ShipYard {

    public static void main(String[] args) {

        ArrayList<Hull> hulls = buildHull(1);
    }

    //
    public static ArrayList<StarDestroyer> buildStarDestroyers(int imperial1Count, int imperial2Count, TreeMap registry){

        ArrayList<StarDestroyer> starDestroyers = new ArrayList<>();
        for (int i = 0; i < imperial1Count; i++){
            ImperialClassI type1 = new ImperialClassI("bobby");
            starDestroyers.add(type1);
        }
        for (int i = 0; i < imperial2Count; i++){
            ImperialClassII type2 = new ImperialClassII("tommy");
            starDestroyers.add(type2);
        }
        return starDestroyers;

    }

    //builds a hull object by assembling all components of the Hull object and returns specified number of Hull objects
    public static ArrayList<Hull> buildHull(int hullCount){

        ArrayList<Hull> hullObjects = new ArrayList<>();
        for (int i = 0; i < hullCount; i++){

            Hull hull = new Hull(new FwdHullSection(),new MidHullSection(), new AftHullSection(), new SuperStructure());
            hullObjects.add(hull);

        }
        return hullObjects;
    }
    //builds an Propulsion object by assembling all components of Propulsion and returns specified number of Propulsion
    // objects
    public static ArrayList<Propulsion> buildPropulsion(int propulsionCount){
        ArrayList<Propulsion> propulsionObjects = new ArrayList<>();

        for (int i = 0; i < propulsionCount; i++){
            Propulsion propulsion = new Propulsion(new IonEngine(),new IonEngine(),new HyperDrive());
            propulsionObjects.add(propulsion);
        }
        return propulsionObjects;
    }
    //builds an Armament object by assembling all components of Armament and returns specified number of armament
    // objects
    public static ArrayList<Armament> buildArmament(int armamentCount){
        ArrayList<Armament> armamentObjects = new ArrayList<>();

        for (int i = 0; i < armamentCount; i++){
            Armament armament = new Armament(new TurboLaserCannon[20],new HeavyIonCannon[40]);
            armamentObjects.add(armament);
        }
        return armamentObjects;
    }


}
