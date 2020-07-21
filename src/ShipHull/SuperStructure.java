package ShipHull;

public class SuperStructure extends HullSection {

    private static int value = 0;
    public SuperStructure() {

        super("super",1000,200,350,600,300,false);
        IDNumber = String.format("%03d",value++);

    }

}
