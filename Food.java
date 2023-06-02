public class Food extends Pet implements FoodBehavior {
    protected String foodName;
    protected String foodDescription;
    protected int foodPrice;
    protected int foodSaturation;
    protected int foodEnergy;

    public Food(String foodName, String foodDescription, int foodPrice, int foodSaturation, int foodEnergy) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodSaturation = foodSaturation;
        this.foodEnergy = foodEnergy;
    }

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

    Food steak = new Food("Steak", "Yummy", 50, 50, 100);
}
