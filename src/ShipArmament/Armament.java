package ShipArmament;

public class Armament {

    private String IDNumber;
    private TurboLaserCannon turboLaserCannon;
    private HeavyIonCannon heavyIonCannon;
    private TurboLaserCannon[]mainBattery;
    private HeavyIonCannon[]secondBattery;
    private int totalCost;

    public Armament(TurboLaserCannon[] mainBattery, HeavyIonCannon[] secondBattery) {
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
