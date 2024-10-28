package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculation");
        System.out.println("0 - Exit");
        System.out.print("Your choice:");
        Scanner greetDialog = new Scanner(System.in);
        int option = greetDialog.nextInt();

        if (option == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.ask();
            greetDialog.close();  //важно, что закрытие диалога должно быть здесь
        }

        if (option == 2)  {
            Evengame.game();
            greetDialog.close();  //важно, что закрытие диалога должно быть здесь
        }

        if (option == 3)  {
            Calcgame.game();
            greetDialog.close();  //важно, что закрытие диалога должно быть здесь
        }
    }
}
