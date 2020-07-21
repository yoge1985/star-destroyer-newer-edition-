package ShipHull;

public class MidHullSection extends HullSection {


    public MidHullSection() {
        super(2100,"Mid",700,190,700,1100,false);
        IDNumber++;


    }

    public int getCostToBuild(){
        return costToBuild;
    }
}
