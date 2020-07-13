package ShipArmament;

public class TurboLaserCannon extends Cannon {

    public TurboLaserCannon(String IDNumber, String cannonType, int maxRange, int costToBuild, boolean installed) {
        super(IDNumber, "TurboLaser", 500, 2, false);
    }

    @Override
    public void fireCannon(String tgt) {
        super.fireCannon(tgt);
    }
}
