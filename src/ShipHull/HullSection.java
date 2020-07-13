package ShipHull;

public abstract class HullSection {

    protected String IDNumber;
    protected String sectionType;
    protected int costToBuild;
    protected int length;
    protected int height;
    protected int width;
    protected int weight;
    protected boolean assembled;


    public void displaySectionInfo(){

    }

    public String getIDNumber() {
        return IDNumber;
    }

    public String getSectionType() {
        return sectionType;
    }

    public int getCostToBuild() {
        return costToBuild;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isAssembled() {
        return assembled;
    }
}
