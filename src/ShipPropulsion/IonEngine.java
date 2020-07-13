package ShipPropulsion;

public class IonEngine extends Engine {

    public IonEngine() {
        engineType = "Ion";
        costToBuild = 25;
        maxThrust = 2000;
        weight = 135;
        fuelCapacity = 800;
        installed = false;
    }
}
