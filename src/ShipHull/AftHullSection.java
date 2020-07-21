package ShipHull;

public class AftHullSection extends HullSection {

    private static int value = 0;

    public AftHullSection() {
        super("Aft",2800,500,130,570,1900,false);
        IDNumber = String.format("%03d",value++);
    }

}
