import java.io.*;
import java.util.*;

public class DotComBust {
    private int numOfGuesses = 0;
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for(DotCom d : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            d.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        Scanner scan = new Scanner(System.in);
        while(!dotComsList.isEmpty()){
            System.out.println("Enter a guess.");
            String guess = scan.nextLine().toLowerCase();
            System.out.println(checkUserGuess(guess));
        }
        finishGame();
    }

    private String checkUserGuess(String guess){
        numOfGuesses++;
        String result = "Miss.";

        for(DotCom d : dotComsList){
            result = d.checkYourself(guess);
            if(!result.equals("Miss.")){
                if(result.equals("Kill!")){
                    System.out.println("You destroyed " + d.getName());
                    dotComsList.remove(d);
                }
                return (result);
            }
        }
        return result;
    }

    private void finishGame(){
        System.out.println("All dot coms are dead! Your stock is now worthless.");
        if(numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        }
        else{
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
}
