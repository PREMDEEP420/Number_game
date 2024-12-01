import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public NumberGuessingGame() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      boolean var3 = true;
      System.out.println("Welcome to the Number Guessing Game!");

      while(var3) {
         int var4 = var2.nextInt(100) + 1;
         int var5 = 0;
         byte var6 = 10;
         boolean var7 = false;
         System.out.println("\nA number between 1 and 100 has been generated.");
         System.out.println("You have " + var6 + " attempts to guess it!");

         while(var5 < var6 && !var7) {
            System.out.print("Enter your guess: ");
            int var8 = var1.nextInt();
            ++var5;
            if (var8 == var4) {
               System.out.println("Congratulations! You guessed the correct number!");
               var7 = true;
            } else if (var8 < var4) {
               System.out.println("Too low! Try again.");
            } else {
               System.out.println("Too high! Try again.");
            }
         }

         if (!var7) {
            System.out.println("You've run out of attempts! The number was: " + var4);
         }

         System.out.print("\nWould you like to play another round? (yes/no): ");
         String var9 = var1.next().toLowerCase();
         var3 = var9.startsWith("y");
      }

      System.out.println("Thanks for playing! Goodbye!");
      var1.close();
   }
}
