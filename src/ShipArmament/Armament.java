package ShipArmament;

public class Armament {

    private String IDNumber;
    private TurboLaserCannon turboLaserCannon;
    private HeavyIonCannon heavyIonCannon;
    private TurboLaserCannon[]mainBattery;
    private HeavyIonCannon[]secondBattery;
    private int totalCost;

    public Armament() {
        this.mainBattery = new TurboLaserCannon[20];
        this.secondBattery = new HeavyIonCannon[40];
        this.turboLaserCannon = new TurboLaserCannon();
        this.heavyIonCannon = new HeavyIonCannon();
        this.mainBattery = new TurboLaserCannon[20];
        this.secondBattery = new HeavyIonCannon[40];
        totalCost = turboLaserCannon.getCost() + heavyIonCannon.getCost();
    }

    public void displayArmamentSpecs(){

    }

    public int getTotalCost(){
        return totalCost;
    }
}
