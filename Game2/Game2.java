
package game2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yash
 */
public class Game2 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
       
        int tryCount = 0;
        int numberOftry=5;
            System.out.println("**********--------------------------------- *************");
            System.out.println("**********|WELCOME TO NUMBER GUESSING GAME|***************");
            System.out.println("**********---------------------------------*************");
            int i = 100;
        while (numberOftry>0) {
            
            System.out.println("ENTER YOUR GUESS (1-100)");
            System.out.println("---------------------------");
            int playerguess = scanner.nextInt();
            tryCount++;
            
            if (playerguess == randomNumber) {
                System.out.println("Correct! You win!");
                System.out.println("IT TOOK YOU " + tryCount + " TRIES");
                System.out.println("Your Score is : "+i);
                break;
            } else if (randomNumber > playerguess) {
                System.out.println("NOPE! THE NUMBER IS HIGHER. GUESS AGAIN.");
                i -= 20;
            } else {
                System.out.println("NOPE! THE NUMBER IS LOWER. GUESS AGAIN.");
                i -= 20;
            }
            numberOftry--;
           System.out.println("--------------------------------");
            System.out.println("YOU HAVE "+numberOftry+" TRY LEFT");
           System.out.println("--------------------------------");
                                          
        }
        if(numberOftry==0){
            System.out.println("Your Score is : "+i);
            System.out.println("---------------------------------");
             System.out.println("                               ");
             System.out.println("THE NUMBER IS   " + randomNumber);
              System.out.println("                              ");
               System.out.println("------------------------------");
            System.out.println("***********************");
            System.out.println("***********************");
            System.out.println("GAME OVER");
            System.out.println("***********************");
            System.out.println("***********************");
            System.out.println("THANKS FOR PLAYING GAME");
            System.out.println("***********************");
            System.out.println("***********************");
        }
        scanner.close();
    }
}

