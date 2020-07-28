package ShipYard;

import ImperialShip.ImperialClassI;
import ImperialShip.StarDestroyer;
import ShipArmament.Armament;
import ShipHull.Hull;
import ShipPropulsion.Propulsion;
import Supporting.Location;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

 enum IType{
    TYPE_1, TYPE_2;
}

public class ShipYard {

    public static void main(String[] args) {

        TreeMap<String, Type> treeMap = new TreeMap<String, Type>();
        treeMap.put("ISS-231 Stragler",new Type(IType.TYPE_1,new Location(10,20,30)));
        treeMap.put("ISS-122 Ravager",new Type(IType.TYPE_1,new Location(20,25,32)));
        treeMap.put("ISS-432 Disruptor",new Type(IType.TYPE_1,new Location(30,30,34)));
        treeMap.put("ISS-987 Devastator",new Type(IType.TYPE_1,new Location(40,35,36)));
        treeMap.put("ISS-765 Desolation",new Type(IType.TYPE_1,new Location(50,40,38)));
        treeMap.put("ISS-411 Exterminator",new Type(IType.TYPE_1,new Location(60,45,40)));
        treeMap.put("ISS-290 Razor",new Type(IType.TYPE_1,new Location(70,50,42)));
        treeMap.put("ISS-478 Spoiler",new Type(IType.TYPE_1,new Location(80,55,44)));
        treeMap.put("ISS-900 Annihilator",new Type(IType.TYPE_1,new Location(90,60,46)));

        treeMap.put("ISS-561 Havoc",new Type(IType.TYPE_2,new Location(90,20,10)));
        treeMap.put("ISS-134 Crusher",new Type(IType.TYPE_2,new Location(80,25,12)));
        treeMap.put("ISS-477 Despoiler",new Type(IType.TYPE_2,new Location(70,30,14)));
        treeMap.put("ISS-329 Ruiner",new Type(IType.TYPE_2,new Location(60,35,16)));
        treeMap.put("ISS-651 Raider",new Type(IType.TYPE_2,new Location(50,40,18)));
        treeMap.put("ISS-11 Ransacker",new Type(IType.TYPE_2,new Location(40,45,20)));
        treeMap.put("ISS-90 Wrecker",new Type(IType.TYPE_2,new Location(30,50,22)));
        treeMap.put("ISS-98 Sacker",new Type(IType.TYPE_2,new Location(20,55,24)));
        treeMap.put("ISS-200 Obliterator",new Type(IType.TYPE_2,new Location(10,60,26)));

        Iterator<Map.Entry<String,Type>> itr = treeMap.entrySet().iterator();
        StarDestroyer sd = null;
        while (itr.hasNext()){
            Map.Entry<String,Type> entry = itr.next();
            if (entry.getValue().equals(IType.TYPE_1)){
                sd = new ImperialClassI(entry.getKey(),);
            }
        }



    }


    public static ArrayList<StarDestroyer> buildStarDestroyers(int imperial1Count, int imperial2Count, TreeMap registry){


      }

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
