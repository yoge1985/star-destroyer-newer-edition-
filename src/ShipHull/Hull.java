package ShipHull;

public class Hull {

    private int idValue = 0;
    private String IDNumber;
    private FwdHullSection forwardSection;
    private MidHullSection midSection;
    private AftHullSection aftSection;
    private SuperStructure bridge;
    private int totalHullCost;

    public Hull(FwdHullSection forwardSection, MidHullSection midSection, AftHullSection aftSection, SuperStructure bridge) {
        idValue++;
        IDNumber = "Hull - " + String.format("%03d",idValue);
        this.forwardSection = forwardSection;
        this.midSection = midSection;
        this.aftSection = aftSection;
        this.bridge = bridge;
        this.totalHullCost = forwardSection.getCostToBuild() + midSection.getCostToBuild()
                                + aftSection.getCostToBuild();
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
