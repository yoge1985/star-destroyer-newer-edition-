package ShipArmament;

public class TurboLaserCannon extends Cannon {
    private static int value = 0;

    public TurboLaserCannon() {
        super("TurboLaser", 500, 2, false);
        IDNumber = String.format("%03d",value++);
    }

    @Override
    public void fireCannon(String tgt) {
        super.fireCannon(tgt);
    }

}
