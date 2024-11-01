package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculation");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice:");
        Scanner greetDialog = new Scanner(System.in);

        var option = greetDialog.next().charAt(0);
        if (option == '1') {
            System.out.println("Welcome to the Brain Games!");
            Cli.ask();
            greetDialog.close();  //важно, что закрытие диалога должно быть здесь
        }
        if (option == '2')  {
            Even.game();
            greetDialog.close();
        }
        if (option == '3') {
            Calc.game();
            greetDialog.close();
        }
        if (option == '4')  {
            Gcd.game();
            greetDialog.close();
        }
        if (option == '5')  {
            Progression.game();
            greetDialog.close();
        }
        if (option == '6')  {
            Prime.game();
            greetDialog.close();
        } else {
            greetDialog.close();
        }
    }
}
