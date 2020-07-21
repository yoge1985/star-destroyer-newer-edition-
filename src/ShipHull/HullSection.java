package ShipHull;

public abstract class HullSection {

    protected  int IDNumber = 0;
    protected String sectionType;
    protected  static int costToBuild;
    protected int length;
    protected int height;
    protected int width;
    protected int weight;
    protected boolean assembled;


    public void displaySectionInfo(){

        System.out.println("section type:" + sectionType);
        System.out.println("cost to build: " + costToBuild);
        System.out.println("length: " + length);
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("weight: " + weight);

    }


}
