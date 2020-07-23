package ShipPropulsion;

public class HyperDrive extends Engine {

    private static String engineType = "Hyper";
    private static int value;

    public HyperDrive() {
        super(engineType,engineType +"-"+String.format("%03d",value++), 1900, 19000, 500, 975, false);
    }
}
