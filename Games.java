public class Games extends Pet implements GameBehavior{
    public String gameName;
    public boolean gameWin;
    public int gameSaturation;
    public int gameEnergy;
    public int gameFun;
    public int gameMoney;
    private Pet pet;

    public Games(String gameName, boolean gameWin, int gameSaturation, int gameEnergy, int gameFun, int gameMoney, Pet pet) {
        //Constructor with parameters
        this.gameName = gameName;
        this.gameWin = gameWin;
        this.gameSaturation = gameSaturation;
        this.gameEnergy = gameEnergy;
        this.gameFun = gameFun;
        this.gameMoney = gameMoney;
        this.pet = pet;
    }

    public void useSaturation(){
        //Reduces the pet's saturation
        pet.petSaturation -= gameSaturation;
    }
    public void useEnergy(){
        //Reduces the pet's energy
        pet.petEnergy -= gameEnergy;
    }
    public void addFun(){
        //Adds the pet's fun
        pet.petFun += gameFun;
    }
    public void reduceFun(){
        //Reduces the pet's fun
        pet.petFun -= gameFun;
    }

    public void earnMoney(){
        //Increase money
        pet.petMoney += gameMoney;
    }


}
