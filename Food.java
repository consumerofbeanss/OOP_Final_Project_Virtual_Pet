public class Food extends Pet implements FoodBehavior {
    public String foodName;
    public String foodDescription;
    public int foodPrice;
    public int foodSaturation;
    public int foodEnergy;
    private Pet pet;

    public Food(String foodName, String foodDescription, int foodPrice, int foodSaturation, int foodEnergy, Pet pet) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodSaturation = foodSaturation;
        this.foodEnergy = foodEnergy;
        this.pet = pet;
    }



    public void eatFoodSat(){
        pet.petSaturation += foodSaturation;
    }

    public void eatFoodEn(){
        pet.petEnergy += foodEnergy;
    }

    public void useMoney(){
        pet.petMoney -= foodPrice;
    }

    public void eatFood(){
        if (pet.petMoney>=foodPrice){
            eatFoodSat();
            eatFoodEn();
            useMoney();
            System.out.println("You fed " + pet.petName + " some " + foodDescription + " " + foodName + "." );
        }
        else{
            System.out.println("Not enough money!");
        }
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
