import java.io.*;

public class SaveLoad {

    private static final String FILE_PATH = "petdata.txt";

    public static void savePet(Pet pet) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(pet.petName + "," + pet.petSaturation + "," + pet.petFun + "," + pet.petEnergy + "," + pet.petMoney);
            System.out.println("Pet saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving pet: " + e.getMessage());
        }
    }

    public static Pet loadPet() {
        Pet pet = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = reader.readLine();
            if (line != null) {
                String[] petData = line.split(",");
                if (petData.length == 5) {
                    pet = new Pet(petData[0], Integer.parseInt(petData[1]), Integer.parseInt(petData[2]),
                            Integer.parseInt(petData[3]), Integer.parseInt(petData[4]));
                    System.out.println("Pet loaded successfully!");
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading pet: " + e.getMessage());
        }
        return pet;
    }

    public static void main(String[] args) {
        Pet pet = new Pet("Steve", 100, 75, 100, 2000);

        // Save the pet
        savePet(pet);

        // Load the pet
        Pet loadedPet = loadPet();

        // Verify if the loaded pet is not null
        if (loadedPet != null) {
            System.out.println("Loaded Pet Name: " + loadedPet.petName);
            System.out.println("Loaded Pet Saturation: " + loadedPet.petSaturation);
            System.out.println("Loaded Pet Fun: " + loadedPet.petFun);
            System.out.println("Loaded Pet Energy: " + loadedPet.petEnergy);
            System.out.println("Loaded Pet Money: " + loadedPet.petMoney);
        }
    }
}
