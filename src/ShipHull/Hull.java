package ShipHull;

public class Hull {

    private String IDNumber;
    private FwdHullSection forwardSection;
    private MidHullSection midSection;
    private AftHullSection aftSection;
    private SuperStructure bridge;

    public void displayHullSpecs(){

        System.out.println("-----------------------");

        System.out.println("star destroyer Hull:" + IDNumber
        + "\nForward Hull Section: " + forwardSection.getIDNumber()
                +"\nMid Hull Section: " + midSection.getIDNumber()
                +"Aft Hull Section: " + aftSection.getIDNumber()
                +"Bridge: " + bridge.getIDNumber());
    }

}
