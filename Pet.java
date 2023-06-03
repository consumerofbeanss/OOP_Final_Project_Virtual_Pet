import javax.xml.namespace.QName;

public class Pet {
    protected String name;
    protected int saturation;
    protected int fun;
    protected int energy;
    protected int money;

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
}
