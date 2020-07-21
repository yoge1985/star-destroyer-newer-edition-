package ShipHull;

public class FwdHullSection extends HullSection {



    public FwdHullSection() {
        super(1800,"Fwd", 400, 150, 700, 900, false);
        IDNumber++;
    }


    public int getCostToBuild(){
        return costToBuild;
    }




}
