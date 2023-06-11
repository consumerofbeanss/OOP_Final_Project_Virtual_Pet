import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Boolean loop = true;
        Pet pet = new Pet();
        Scanner s = new Scanner(System.in);
        
        Food steak = new Food("Steak", "Yummy", 50, 50, 100);
        Food fries = new Food("Fries", "Tasty", 20, 30, 50);
        Food water = new Food("Water", "Splashy", 10, 20, 25);
        
        MathGame math = new MathGame("Math Game", false, 5, 10, 10);

        System.out.println("What is your pet's name?");
        pet.name = s.nextLine();

        System.out.println("Virtual Pet");

        while (loop) {
            System.out.println("****************************************************************");
            System.out.println(pet.name);
            System.out.println("Stats: \nSaturation: "+ pet.saturation + "\nFun: "+ pet.fun + "\nEnergy: "+ pet.energy + "\nMoney: "+ pet.money);
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
                    math.playGame();
                    break;

                case "3":

                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    loop = false;
                    break;
            }
        }
    }

}
