package ShipHull;

public class AftHullSection extends HullSection {

    private final static int COST_TO_BUILD = 2800;
    private final static int LENGTH = 500;
    private final static int HEIGHT = 130;
    private final static int WEIGHT = 1900;

    public AftHullSection() {
        IDNumber++;
        sectionType = "Aft";
        assembled = false;
    }

    public int getCostToBuild(){
        return COST_TO_BUILD;
    }
}
