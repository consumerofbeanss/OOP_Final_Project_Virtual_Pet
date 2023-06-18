public class Food extends Pet implements FoodBehavior {
    public String foodName;
    public String foodDescription;
    public int foodPrice;
    public int foodSaturation;
    public int foodEnergy;
    private Pet pet;

    public Food(String foodName, String foodDescription, int foodPrice, int foodSaturation, int foodEnergy, Pet pet) {
        //Constructor with parameters
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodSaturation = foodSaturation;
        this.foodEnergy = foodEnergy;
        this.pet = pet;
    }



    public void eatFoodSat(){
        //Adds the pet's saturation
        pet.petSaturation += foodSaturation;
    }

    public void eatFoodEn(){
        //Adds the pet's energy
        pet.petEnergy += foodEnergy;
    }

    public void useMoney(){
        //Reduces money
        pet.petMoney -= foodPrice;
    }

    public void eatFood(){
        //Method that runs all functions above under the condition that the user has more money than the price of the food they are purchasing
        if (pet.petMoney>=foodPrice){
            eatFoodSat();
            eatFoodEn();
            useMoney();
            Art.eat();
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
