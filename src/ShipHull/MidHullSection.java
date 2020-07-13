package ShipHull;

public class MidHullSection extends HullSection {

    private final static int COST_TO_BUILD = 2100;
    private final static int LENGTH = 700;
    private final static int HEIGHT = 190;
    private final static int WIDTH = 700;
    private final static int WEIGHT = 1100;
    private int totalCost;
    public MidHullSection() {
        IDNumber++;
        sectionType = "Mid";
        assembled = false;

    }

    public int getCostToBuild(){
        return COST_TO_BUILD;
    }
}
