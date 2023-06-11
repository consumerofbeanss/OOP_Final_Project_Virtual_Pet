import java.util.Random;
import java.util.Scanner;

public class MathGame extends Games{
    public int num1;
    public int num2;
    public int opr;
    public int ans;

    public MathGame(String gameName, boolean gameWin, int gameEnergy, int gameFun, int gameMoney) {
        super(gameName, gameWin, gameEnergy, gameFun, gameMoney);
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

            Scanner math = new Scanner(System.in);
            System.out.println("What is the answer?");
            Integer answer = math.nextInt();
            if (answer.equals(ans)){
                System.out.println("Correct!");
                useEnergy();
                addFun();
                earnMoney();
            }
            else{
                System.out.println("Wrong!");
                useEnergy();
            }

            System.out.println("Again?");
            String answer2 = math.nextLine();
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
