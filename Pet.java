import javax.xml.namespace.QName;
import java.util.Scanner;

public class Pet {
    public String petName;
    public int petSaturation;
    public int petFun;
    public int petEnergy;
    public int petMoney;

    public Pet(){
        this.petName = "Steve";
        this.petSaturation = 100;
        this.petFun = 75;
        this.petEnergy = 100;
        this.petMoney = 2000;
    }

    public Pet(String petName, int petSaturation, int petFun, int petEnergy, int petMoney) {
        this.petName = petName;
        this.petSaturation = petSaturation;
        this.petFun = petFun;
        this.petEnergy = petEnergy;
        this.petMoney = petMoney;
    }
}