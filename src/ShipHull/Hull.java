package ShipHull;

public class Hull {

    private String IDNumber;
    private FwdHullSection forwardSection;
    private MidHullSection midSection;
    private AftHullSection aftSection;
    private SuperStructure bridge;
    private int totalHullCost;

    public Hull() {
        this.IDNumber = IDNumber;
        this.forwardSection = new FwdHullSection();
        this.midSection = new MidHullSection();
        this.aftSection = new AftHullSection();
        this.bridge = new SuperStructure();
        this.totalHullCost = getTotalHullCost();
    }

    public void displayHullSpecs() {
    }

    //returns the total cost of building all the parts of the hull.
    public int getTotalHullCost(){
        return forwardSection.getCostToBuild() + midSection.getCostToBuild() + aftSection.getCostToBuild();
    }
}
