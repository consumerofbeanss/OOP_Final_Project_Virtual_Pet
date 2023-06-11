import java.util.Random;
import java.util.Scanner;

public class Games extends Pet implements GameBehavior{
    public String gameName;
    public boolean gameWin;
    public int gameEnergy;
    public int gameFun;
    public int gameMoney;

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
    public int earnMoney(){
        return money = money+gameMoney;
    }


}
