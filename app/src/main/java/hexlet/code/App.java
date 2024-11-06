package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calculation\n4 - GCD");
        System.out.println("5 - Progression\n6 - Prime\n0 - Exit\nYour choice:");
        greetDialog();
    }

    private static void greetDialog() {
        Scanner in = new Scanner(System.in);
        char option = in.next().charAt(0);
        switch (option) {
            case '1':
                System.out.println("Welcome to the Brain Games!");
                Cli.ask();
                break;
            case '2':
                Even.start();
                break;
            case '3':
                Calc.start();
                break;
            case '4':
                Gcd.start();
                break;
            case '5':
                Progression.start();
                break;
            case '6':
                Prime.start();
                break;
            default:
        }
        in.close();
    }
}
