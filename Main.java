import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean loop = true;
        Pet pet = new Pet("Steve", 75, 75, 100, 2000);
        Scanner s = new Scanner(System.in);
        
        Food steak = new Food("Steak", "Yummy", 50, 50, 100, pet);
        Food fries = new Food("Fries", "Tasty", 20, 30, 50, pet);
        Food water = new Food("Water", "Splashy", 10, 20, 25, pet);

        MathGame math = new MathGame("Math Game", false, 5, 10, 10, pet);

        System.out.println("What is your pet's name?");
        pet.petName = s.nextLine();

        System.out.println("Virtual Pet");

        while (loop) {
            System.out.println("****************************************************************");
            System.out.println(pet.petName);

            System.out.println("Stats: \nSaturation: "+ pet.petSaturation + "\nFun: "+ pet.petFun + "\nEnergy: "+ pet.petEnergy + "\nMoney: "+ pet.petMoney);
            System.out.println("----------------------------------------------------------------");
            System.out.println("Pick action");
            System.out.println("1. Food\n2. Play\n3. Sleep\n4. Save\n5. Load\n6. Quit");
            System.out.println("****************************************************************");
            String choice = s.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("What shall you feed pet?");
                    System.out.println("1. Steak\n2. Fries\n3. Water");
                    String foodChoice = s.nextLine();
                    switch (foodChoice) {
                        case "1" -> steak.eatFood();
                        case "2" -> fries.eatFood();
                        case "3" -> water.eatFood();
                    }
                    break;

                case "2":
                    System.out.println("Let's have some fun!");
                    math.playGame();
                    break;

                case "3":
                    pet.petEnergy = 200;
                    System.out.println("Nighty night!");
                    System.out.println("Energy restored!");
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    loop = false;
                    break;

                default:
                    System.out.println("I can't do that!");
                    break;
            }
        }
    }

}
