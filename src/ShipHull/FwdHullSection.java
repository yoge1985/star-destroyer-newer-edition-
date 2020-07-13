package ShipHull;

public class FwdHullSection extends HullSection {

    private final static int COST_TO_BUILD = 1800;
    private final static int length = 400;
    private final static int height = 150;
    private final static int width = 700;
    private final static int weight = 900;

    public FwdHullSection() {
        IDNumber++;
        sectionType = "Fwd";
        assembled = false;
    }

    public int getCostToBuild(){
        return COST_TO_BUILD;
    }




}
