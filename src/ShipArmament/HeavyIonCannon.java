package ShipArmament;

public class HeavyIonCannon extends Cannon {

    private static int value = 0;

    public HeavyIonCannon() {
        super("Heavy Ion", 1000, 5, false);
        IDNumber = String.format("%03d",value++);

    }

    @Override
    public void fireCannon(String tgt) {
        super.fireCannon(tgt);
    }
}
