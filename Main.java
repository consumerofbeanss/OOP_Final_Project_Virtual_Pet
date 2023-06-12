import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean loop = true;
        Pet pet = new Pet("Steve", 50, 60, 40, 500);
        Scanner s = new Scanner(System.in);
        
        Food steak = new Food("Steak", "Yummy", 50, 50, 100, pet);
        Food fries = new Food("Fries", "Tasty", 20, 30, 50, pet);
        Food water = new Food("Water", "Splashy", 10, 20, 25, pet);
        Food candy = new Food("Candy", "Sweet", 10, 10, 10, pet);

        MathGame math = new MathGame("Math Game", false,5,5, 10, 10, pet);

        System.out.println("What is your pet's name?");
        pet.petName = s.nextLine();

        System.out.println("Java Virtual Pet");

        while (loop) {
            System.out.println("****************************************************************");
            System.out.println(pet.petName);
            if (pet.petFun>80 && pet.petFun<=100){
                Art.happy();
            }else if (pet.petFun>40 && pet.petFun<=80){
                Art.neutral();
            }else{
                Art.sad();
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("Stats: \nSaturation: "+ pet.petSaturation + "\nFun: "+ pet.petFun + "\nEnergy: "+ pet.petEnergy + "\nMoney: "+ pet.petMoney);
            System.out.println("----------------------------------------------------------------");
            System.out.println("Pick action");
            System.out.println("1. Food\n2. Play\n3. Sleep\n4. Save\n5. Load\n6. Quit");
            System.out.println("****************************************************************");
            String choice = s.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("What shall you feed pet?");
                    System.out.println("1. Steak\n2. Fries\n3. Water\n4. Candy");
                    String foodChoice = s.nextLine();
                    switch (foodChoice) {
                        case "1" -> steak.eatFood();
                        case "2" -> fries.eatFood();
                        case "3" -> water.eatFood();
                        case "4" -> candy.eatFood();
                    }
                    Thread.sleep(1000);
                    break;

                case "2":
                    if (pet.petEnergy>0 && pet.petSaturation>=20){
                        System.out.println("Let's have some fun!");
                        math.playGame();
                    } else if (pet.petEnergy>0 && pet.petSaturation<20) {
                        System.out.println("I'm too hungry to play!");
                        Art.tired();
                    } else if (pet.petEnergy == 0 && pet.petSaturation>=20) {
                        System.out.println("I'm too tired to play!");
                        Art.tired();
                    }else{
                        System.out.println("I'm too tired and too hungry to play!");
                        Art.tired();
                    }
                    Thread.sleep(1000);
                    break;

                case "3":
                    pet.petEnergy = 100;
                    Art.sleep();
                    System.out.println("Nighty night!");
                    System.out.println("Energy restored!");
                    Thread.sleep(1500);
                    break;

                case "4":
                    SaveLoad.savePet(pet);
                    break;

                case "5":
                    SaveLoad.loadPet();
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
