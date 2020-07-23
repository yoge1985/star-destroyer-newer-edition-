package ShipPropulsion;

public class IonEngine extends Engine {

    private static String engineType = "Ion";
    private static int value;
    public IonEngine() {
        super(engineType,engineType+"-"+String.format("%03d",value++), 25, 2000, 135, 800, false);
    }
}
