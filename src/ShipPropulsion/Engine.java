package ShipPropulsion;

public abstract class Engine {
    private String IDNumber;
    protected String engineType;
    private int costToBuild;
    private int maxThrust;
    private int weight;
    private int fuelCapacity;
    private boolean installed;
    private  int value;

    public Engine(String engineType,String IDNumber, int costToBuild, int maxThrust, int weight, int fuelCapacity, boolean installed) {
        this.value++;
        this.engineType = engineType;
        this.IDNumber = IDNumber;
        this.costToBuild = costToBuild;
        this.maxThrust = maxThrust;
        this.weight = weight;
        this.fuelCapacity = fuelCapacity;
        this.installed = installed;
    }

    public void displayEngineInfo(){

    }

    public int getCostToBuild(){
        return costToBuild;
    }

    public int getMaxThrust() {
        return maxThrust;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public String getIDNumber(){
        return IDNumber;
    }

    public String getEngineType() {
        return engineType;
    }
}
