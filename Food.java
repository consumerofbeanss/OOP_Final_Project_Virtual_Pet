public class Food extends Pet implements FoodBehavior {
    public String foodName;
    public String foodDescription;
    public int foodPrice;
    public int foodSaturation;
    public int foodEnergy;

    public Food(String foodName, String foodDescription, int foodPrice, int foodSaturation, int foodEnergy) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodSaturation = foodSaturation;
        this.foodEnergy = foodEnergy;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodSaturation() {
        return foodSaturation;
    }

    public void setFoodSaturation(int foodSaturation) {
        this.foodSaturation = foodSaturation;
    }

    public int getFoodEnergy() {
        return foodEnergy;
    }

    public void setFoodEnergy(int foodEnergy) {
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
        if (money>=foodPrice){
            eatFoodSat();
            eatFoodEn();
            useMoney();
            System.out.println("You fed " + name + " some " + foodDescription + " " + foodName + "." );
        }
        else{
            System.out.println("Not enough money!");
        }
        return 0;
    }



    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", foodDescription='" + foodDescription + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodSaturation=" + foodSaturation +
                ", foodEnergy=" + foodEnergy +
                '}';
    }
}
