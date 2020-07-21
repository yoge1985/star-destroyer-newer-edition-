package ShipHull;

public class MidHullSection extends HullSection {

    private static int value = 0;

    public MidHullSection() {
        super("Mid", 2100, 700, 190, 700, 1100, false);
        IDNumber = String.format("%03d",value++);

    }
}
