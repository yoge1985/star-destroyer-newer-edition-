package ShipArmament;

public abstract class Cannon {

    protected String IDNumber;
    private String cannonType;
    private int maxRange;
    private int costToBuild;
    private boolean installed;

    public Cannon(String cannonType, int maxRange, int costToBuild, boolean installed) {
        this.cannonType = cannonType;
        this.maxRange = maxRange;
        this.costToBuild = costToBuild;
        this.installed = installed;
    }

    public void displayCannonInfo(){

    }

    public void fireCannon(String tgt){

    }

    public int getCost(){
        return costToBuild;
    }
}
