public class Rest extends Pet implements RestBehavior{
    public int sleepEnergy;

    public Rest() {
        this.sleepEnergy = 200;
    }

    public int sleep(){
        return energy = sleepEnergy;
    }

}
