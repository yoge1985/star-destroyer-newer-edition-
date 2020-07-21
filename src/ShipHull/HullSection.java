package ShipHull;

public abstract class HullSection {

    protected String IDNumber;
    private String sectionType;
    private int costToBuild;
    private int length;
    private int height;
    private int width;
    private int weight;
    private boolean assembled;

    public HullSection(String sectionType,int costToBuild, int length, int height, int width, int weight, boolean assembled) {
        this.sectionType = sectionType;
        this.costToBuild = costToBuild;
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.assembled = assembled;
    }

    public void displaySectionInfo(){

        System.out.println("section type:" + sectionType);
        System.out.println("cost to build: " + costToBuild);
        System.out.println("length: " + length);
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("weight: " + weight);

    }

    public int getCostToBuild(){
        return costToBuild;
    }


}
