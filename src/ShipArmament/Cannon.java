package ShipArmament;

public abstract class Cannon {

    private String IDNumber;
    private String cannonType;
    private int maxRange;
    private int costToBuild;
    private boolean installed;

    public Cannon(String IDNumber, String cannonType, int maxRange, int costToBuild, boolean installed) {
        this.IDNumber = IDNumber;
        this.cannonType = cannonType;
        this.maxRange = maxRange;
        this.costToBuild = costToBuild;
        this.installed = installed;
    }

    public void displayCannonInfo(){

    }

    public void fireCannon(String tgt){

    }
}
