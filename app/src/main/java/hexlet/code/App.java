package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int option = 0;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculation");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice:");
        Scanner greetDialog = new Scanner(System.in);

        if (greetDialog.hasNextInt()) {
            option = greetDialog.nextInt();
        } else {
            //System.out.println("Извините, но это не число. Попробуйте снова!");
        }

        if (option == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.ask();
            greetDialog.close();  //важно, что закрытие диалога должно быть здесь
        }
        if (option == 2)  {
            Evengame.game();
            greetDialog.close();
        }
        if (option == 3)  {
            Calcgame.game();
            greetDialog.close();
        }
        if (option == 4)  {
            Gcdgame.game();
            greetDialog.close();
        }
        if (option == 5)  {
            Progressiongame.game();
            greetDialog.close();
        }
    }
}
