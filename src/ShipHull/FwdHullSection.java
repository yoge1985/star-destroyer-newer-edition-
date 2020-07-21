package ShipHull;

public class FwdHullSection extends HullSection {

    private static int value = 0;

    public FwdHullSection() {
        super("Fwd",1800, 400, 150, 700, 900, false);
        IDNumber = String.format("%03d",value++);
    }
}
