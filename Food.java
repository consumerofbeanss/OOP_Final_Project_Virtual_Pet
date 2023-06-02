public class Food extends Pet implements FoodBehavior {
    protected String foodName;
    protected String foodDescription;
    protected int foodPrice;
    protected int foodSaturation;
    protected int foodEnergy;

    public int eatFoodSat(){
        return saturation = saturation+foodSaturation;
    }

    public int eatFoodEn(){
        return energy = energy+foodEnergy;
    }

    public int useMoney(){
        return money = money-foodPrice;
    }

    public int eatFood(){
        eatFoodSat();
        eatFoodEn();
        useMoney();
        return 0;
    }
}
