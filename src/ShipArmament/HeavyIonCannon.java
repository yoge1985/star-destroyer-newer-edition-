package ShipArmament;

public class HeavyIonCannon extends Cannon {

    public HeavyIonCannon(String IDNumber, String cannonType, int maxRange, int costToBuild, boolean installed) {
        super(IDNumber, "Heavy Ion", 1000, 5, false);
    }

    @Override
    public void fireCannon(String tgt) {
        super.fireCannon(tgt);
    }
}
