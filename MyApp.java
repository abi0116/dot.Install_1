import java.util.Scanner;
import java.util.Random;

class MyApp {
  public static void main(String[] args) {
    Integer answer = new Random().nextInt(10) + 1;
    Integer count = 0;
    
    while (true) {
      System.out.print("Your guess? ");
      Integer guess = new Scanner(System.in).nextInt();
      // count = count + 1;
      // count += 1;
      count++;
      
      if (answer == guess) {
        System.out.println("Bingo! It took " + count + " guesses! ");
        break;
      } else if (answer > guess ) {
        System.out.println("The answer is higher!");
      } else {
        System.out.println("The answer is lower!");
      }
    }
  }
}