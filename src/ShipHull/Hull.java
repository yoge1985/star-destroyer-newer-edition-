package ShipHull;

public class Hull {

    private int idValue = 0;
    private String IDNumber;
    private FwdHullSection forwardSection;
    private MidHullSection midSection;
    private AftHullSection aftSection;
    private SuperStructure bridge;
    private int totalHullCost;

    public Hull() {
        idValue++;
        IDNumber = "Hull - " + String.format("%03d",idValue);
        this.forwardSection = new FwdHullSection();
        this.midSection = new MidHullSection();
        this.aftSection = new AftHullSection();
        this.bridge = new SuperStructure();
        this.totalHullCost = forwardSection.getCostToBuild() + midSection.getCostToBuild()
                                + aftSection.getCostToBuild() + bridge.getCostToBuild();
    }

    public void displayHullSpecs() {
        forwardSection.getCostToBuild();
        midSection.getCostToBuild();
        aftSection.getCostToBuild();
    }

    //returns the total cost of building all the parts of the hull.
    public int getTotalHullCost(){
        return totalHullCost;
    }
}
