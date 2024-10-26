package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice:");
        Scanner greetDialog = new Scanner(System.in);
        int option = greetDialog.nextInt();

        if (option == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.ask();
            greetDialog.close();
        }

        if (option == 2)  {
            System.out.println("Welcome to the Brain Games!");
            OddGame.main();
            greetDialog.close();
        }
    }
}
