package ShipPropulsion;

public class Propulsion {

    private String IDNumber;
    private IonEngine portEngine;
    private IonEngine starBoardEngine;
    private HyperDrive LSEngine;
    private int totalCost;

    public Propulsion(IonEngine portEngine, IonEngine starBoardEngine, HyperDrive LSEngine) {
        this.IDNumber = IDNumber;
        this.portEngine = portEngine;
        this.starBoardEngine = starBoardEngine;
        this.LSEngine = LSEngine;
        this.totalCost = LSEngine.getCostToBuild() + starBoardEngine.getCostToBuild();
    }

    public void displayPropulsion(){

        System.out.println("Propulsion ID: " + IDNumber + "\nPort Engine"
                + "\nEngine: " + portEngine.engineType
                + portEngine.fuelCapacity + portEngine.maxThrust
                + "\nStarboard engine"
                + "\nEngine ID: " + starBoardEngine.IDNumber + "Engine: Ion" + "\nFuel capacity: "
                + starBoardEngine.fuelCapacity + "\nMaximum thrust: " + starBoardEngine.maxThrust
                + "\nHyperdrive\nEngine ID: " + LSEngine.IDNumber
                + "\nEngine: Hyperdrive\n Fuel capacity: " + LSEngine.fuelCapacity
                + "\nMaximum thrust: " + LSEngine.maxThrust);
    }

    public int getTotalCost(){
        return this.totalCost;
    }
}
