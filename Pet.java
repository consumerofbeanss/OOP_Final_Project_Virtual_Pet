
public class Pet {
    public String petName;
    public int petSaturation;
    public int petFun;
    public int petEnergy;
    public int petMoney;

    public Pet(){
        //Default constructor displaying default stats
        this.petName = "Steve";
        this.petSaturation = 50;
        this.petFun = 60;
        this.petEnergy = 40;
        this.petMoney = 500;
    }

    public Pet(String petName, int petSaturation, int petFun, int petEnergy, int petMoney) {
        //Constructor with parameters
        this.petName = petName;
        this.petSaturation = petSaturation;
        this.petFun = petFun;
        this.petEnergy = petEnergy;
        this.petMoney = petMoney;
    }

    public void updatePet(Pet petNew) {
        //Overrides the current pet's data with the data from another pet object, used to load a save file
        this.petName = petNew.petName;
        this.petSaturation = petNew.petSaturation;
        this.petFun = petNew.petFun;
        this.petEnergy = petNew.petEnergy;
        this.petMoney = petNew.petMoney;
    }
}