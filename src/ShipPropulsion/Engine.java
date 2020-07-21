package ShipPropulsion;

public abstract class Engine {

    protected String IDNumber;
    protected String engineType;
    protected int costToBuild;
    protected int maxThrust;
    protected int weight;
    protected int fuelCapacity;
    protected boolean installed;


    public void displayEngineInfo(){

    }

    public int getCostToBuild(){
        return costToBuild;
    }
}
