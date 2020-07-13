package ShipArmament;

public class Armament {

    private String IDNumber;
    private TurboLaserCannon[]mainBattery;
    private HeavyIonCannon[]secondBattery;

    public Armament(TurboLaserCannon[] mainBattery, HeavyIonCannon[] secondBattery) {
        this.mainBattery = new TurboLaserCannon[20];
        this.secondBattery = new HeavyIonCannon[40];
    }

    public void displayArmamentSpecs(){

    }
}
