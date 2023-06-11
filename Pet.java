import javax.xml.namespace.QName;
import java.util.Scanner;

public class Pet {
    public String name;
    public int saturation;
    public int fun;
    public int energy;
    public int money;

    public Pet(){
        this.saturation = 100;
        this.energy = 200;
        this.fun = 100;
        this. money = 5000;
    }

    public Pet(String name, int saturation, int fun, int energy, int money) {
        this.name = name;
        this.saturation = saturation;
        this.fun = fun;
        this.energy = energy;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public int getFun() {
        return fun;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
