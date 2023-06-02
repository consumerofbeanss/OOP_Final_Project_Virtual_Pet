public abstract class Games extends Pet implements GameBehavior{
    protected String gameName;
    protected boolean gameWin;
    protected int gameEnergy;
    protected int gameFun;
    protected int gameMoney;

    public Games(String gameName, boolean gameWin, int gameEnergy, int gameFun, int gameMoney) {
        this.gameName = gameName;
        this.gameWin = gameWin;
        this.gameEnergy = gameEnergy;
        this.gameFun = gameFun;
        this.gameMoney = gameMoney;
    }

    public int useEnergy(){
        return energy = energy-gameEnergy;
    }

    public int addFun(){
        return fun = fun+gameFun;
    }
    public int getMoney(){
        return money = money+gameMoney;
    }

}
