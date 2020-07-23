package ShipPropulsion;

public class Propulsion {

    private String IDNumber;
    private IonEngine portEngine;
    private IonEngine starBoardEngine;
    private HyperDrive LSEngine;
    private int totalCost;
    private int value;

    public Propulsion() {
        value++;
        this.IDNumber = "Prop-" + String.format("%03d",value);
        this.portEngine = new IonEngine();
        this.starBoardEngine = new IonEngine();
        this.LSEngine = new HyperDrive();
        this.totalCost = LSEngine.getCostToBuild() + portEngine.getCostToBuild()+ starBoardEngine.getCostToBuild();
    }

    public void displayPropulsionSpec(){

        System.out.println("\n\nPropulsion ID:" + this.IDNumber);
        System.out.println("Port engine");
        System.out.println("Engine ID:" + portEngine.getIDNumber());
        System.out.println("Engine: " + portEngine.getEngineType());
        System.out.println("Fuel capacity: " + portEngine.getFuelCapacity());
        System.out.println("Maximum thrust: " + portEngine.getMaxThrust());
        System.out.println("\n\nStarboard Engine");
        System.out.println("Engine ID: " + starBoardEngine.getIDNumber());
        System.out.println("Engine: " + starBoardEngine.getEngineType());
        System.out.println("Fuel capacity: " + starBoardEngine.getFuelCapacity());
        System.out.println("Maximum thrust: " + starBoardEngine.getMaxThrust());
        System.out.println("\n\nHyperdrive");
        System.out.println("Engine ID: " + LSEngine.getIDNumber());
        System.out.println("Engine: " + LSEngine.getEngineType());
        System.out.println("Fuel capacity: " + LSEngine.getFuelCapacity());
        System.out.println("Maximum thrust: " + LSEngine.getMaxThrust());
    }

    public int getTotalCost(){
        return this.totalCost;
    }

    public void displayPropulsionSpecs(){

    }
}
