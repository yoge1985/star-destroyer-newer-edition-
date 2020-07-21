package ShipHull;

public class AftHullSection extends HullSection {

    public AftHullSection() {
        super(2800,"Aft",500,130,570,1900,false);
        IDNumber++;
    }

    public int getCostToBuild(){
        return costToBuild;
    }
}
