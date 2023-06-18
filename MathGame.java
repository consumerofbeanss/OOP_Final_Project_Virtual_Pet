import java.util.Random;
import java.util.Scanner;

public class MathGame extends Games{
    public int num1;
    public int num2;
    public int opr;
    public int ans;

    public MathGame(String gameName, boolean gameWin, int gameSaturation, int gameEnergy, int gameFun, int gameMoney, Pet pet) {
        //Constructor with the same parameters as the Games class
        super(gameName, gameWin, gameSaturation, gameEnergy, gameFun, gameMoney, pet);
    }


    public void playGame(){
        //Plays the game
        gameWin = false;
        //While loop
        while (gameWin == false) {
            //Initializes random generator
            Random rand = new Random();
            int random_num_upperbound = 11;
            //Chooses number from 0 to 10
            num1 = rand.nextInt(random_num_upperbound);
            num2 = rand.nextInt(random_num_upperbound);

            int operator_chooser = 3;
            //Chooses the operation
            opr = rand.nextInt(operator_chooser);
            if (opr == 0) {
                //Prints problem
                System.out.println(num1 + "+" + num2);
                //Generates the correct answer to the problem
                ans = num1 + num2;
            } else if (opr == 1) {
                //Prints problem
                System.out.println(num1 + "-" + +num2);
                //Generates the correct answer to the problem
                ans = num1 - num2;
            } else {
                //Prints problem
                System.out.println(num1 + "*" + num2);
                //Generates the correct answer to the problem
                ans = num1 * num2;
            }

            Scanner math = new Scanner(System.in);
            System.out.println("What is the answer?");
            Integer answer = math.nextInt();
            //Checks if the input is the same as the answer. If it is, it adds the pet's fun and increases money
            //Otherwise, it decreases the fun, but doesn't change the money value
            //No matter the answer, the pet will use energy and saturation
            if (answer.equals(ans)) {
                System.out.println("Correct!");
                useSaturation();
                useEnergy();
                addFun();
                earnMoney();
                //Ends the game
                gameWin = true;
                Art.happy();
            } else {
                System.out.println("Wrong!");
                useSaturation();
                useEnergy();
                reduceFun();
                //Ends the game
                gameWin = true;
                Art.sad();
            }
        }
    }

}
