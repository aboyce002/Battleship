import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    /*public static void main(String[] args) {
        int numOfGuesses = 0;
        Scanner scan = new Scanner(System.in);
        DotCom dot = new DotCom();

        int randomNum = (int)(Math.random() * 5);
        ArrayList<String> locations = {randomNum, randomNum+1, randomNum+2};
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            System.out.println("Enter a number.");
            String guess = scan.nextLine();
            String result = dot.checkYourself(guess);
            System.out.println(result);
            numOfGuesses++;

            if(result.equals("Kill!")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }
    }*/
}
