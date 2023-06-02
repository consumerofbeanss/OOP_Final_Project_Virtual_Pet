import java.util.Random;
import java.util.Scanner;

public class MathGame extends Games implements GameBehavior{
    protected int num1;
    protected int num2;
    protected int opr;
    protected int ans;



    public MathGame(String gameName, boolean gameWin, int gameEnergy, int gameFun, int gameMoney) {
        super(gameName, gameWin, gameEnergy, gameFun, gameMoney);
        this.gameName = "Math Game";
        this.gameEnergy = 5;
        this.gameFun = 10;
        this.gameMoney = 10;
    }


    public void playGame(){
        while (gameWin == false) {
            Random rand = new Random();
            int random_num_upperbound = 11;
            num1 = rand.nextInt(random_num_upperbound);
            num2 = rand.nextInt(random_num_upperbound);

            int operator_chooser = 3;
            opr = rand.nextInt(operator_chooser);
            if (opr == 0){
                System.out.println(num1 + "+" + num2);
                ans = num1 + num2;
            }
            else if(opr == 1){
                System.out.println(num1 + "-" + + num2);
                ans = num1 - num2;
            }
            else {
                System.out.println(num1 + "*" + num2);
                ans = num1 * num2;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the answer?");
            Integer answer = scanner.nextInt();
            if (answer.equals(ans)){
                System.out.println("Correct!");
                useEnergy();
                addFun();
                getMoney();
            }
            else{
                System.out.println("Wrong!");
                useEnergy();
            }

            System.out.println("Again?");
            String answer2 = scanner.nextLine();
            if (answer2.equals("Yes")){
                gameWin = false;
            }
            else if (answer2.equals("No")){
                gameWin = true;
            }
            else{
                gameWin = false;
            }

        }
    }
}
