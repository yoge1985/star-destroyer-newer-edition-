package ShipHull;

public class SuperStructure extends HullSection {

    public SuperStructure(String IDNumber, String sectionType, int costToBuild, int length, int height, int width, int weight, boolean assembled) {
        super(IDNumber, "Super", 1000, 200, 350, 600, 300, false);
    }
}
