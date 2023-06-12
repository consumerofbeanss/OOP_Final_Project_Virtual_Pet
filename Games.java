public class Games extends Pet implements GameBehavior{
    public String gameName;
    public boolean gameWin;
    public int gameSaturation;
    public int gameEnergy;
    public int gameFun;
    public int gameMoney;
    private Pet pet;

    public Games(String gameName, boolean gameWin, int gameSaturation, int gameEnergy, int gameFun, int gameMoney, Pet pet) {
        this.gameName = gameName;
        this.gameWin = gameWin;
        this.gameSaturation = gameSaturation;
        this.gameEnergy = gameEnergy;
        this.gameFun = gameFun;
        this.gameMoney = gameMoney;
        this.pet = pet;
    }

    public void useSaturation(){
        pet.petSaturation -= gameSaturation;
    }
    public void useEnergy(){
        pet.petEnergy -= gameEnergy;
    }
    public void addFun(){
        pet.petFun += gameFun;
    }
    public void reduceFun(){
        pet.petFun -= gameFun;
    }

    public void earnMoney(){
        pet.petMoney += gameMoney;
    }


}
