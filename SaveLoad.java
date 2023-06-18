import java.io.*;

public class SaveLoad {

    //Creating a text file
    private static final String FILE_PATH = "petdata.txt";

    public static void savePet(Pet pet) {
        //Saving function
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            //Writing the pet's current status into text file
            writer.write(pet.petName + "," + pet.petSaturation + "," + pet.petFun + "," + pet.petEnergy + "," + pet.petMoney);
            System.out.println("Pet saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving pet: " + e.getMessage());
        }
    }

    public static Pet loadPet() {
        //Loading function
        //Creating a temp pet object
        Pet petNew = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            //Reading the save file
            String line = reader.readLine();
            if (line != null) {
                String[] petData = line.split(",");
                if (petData.length == 5) {
                    //Creating data into temp pet object
                    petNew = new Pet(petData[0], Integer.parseInt(petData[1]), Integer.parseInt(petData[2]),
                            Integer.parseInt(petData[3]), Integer.parseInt(petData[4]));
                    System.out.println("Pet loaded successfully!");
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading pet: " + e.getMessage());
        }
        return petNew;
    }
}
