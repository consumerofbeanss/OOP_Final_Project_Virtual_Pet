
public class Pet {
    public String petName;
    public int petSaturation;
    public int petFun;
    public int petEnergy;
    public int petMoney;

    public Pet(){
        this.petName = "Steve";
        this.petSaturation = 50;
        this.petFun = 60;
        this.petEnergy = 40;
        this.petMoney = 500;
    }

    public Pet(String petName, int petSaturation, int petFun, int petEnergy, int petMoney) {
        this.petName = petName;
        this.petSaturation = petSaturation;
        this.petFun = petFun;
        this.petEnergy = petEnergy;
        this.petMoney = petMoney;
    }

    public void updatePet(Pet petNew) {
        this.petName = petNew.petName;
        this.petSaturation = petNew.petSaturation;
        this.petFun = petNew.petFun;
        this.petEnergy = petNew.petEnergy;
        this.petMoney = petNew.petMoney;
    }
}