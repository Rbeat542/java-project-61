package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void gameStart() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner in2 = new Scanner(System.in);
        String str = in2.nextLine();
        User.setName(str);
        System.out.println("Hello, " + User.getName() + "!");
        System.out.println(str);
    }

    public static int gameLogic(String[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println(arr[0]);
        System.out.print("Your answer: ");
        String input = in.nextLine();
        int signalToQuit = 0;
        if (arr[1].equals(input)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + input + "'" + " is wrong answer ;(.");
            System.out.println("Correct answer was '" + arr[1] + "'");
            System.out.println("Let's try again, " + User.getName() + "!");
            signalToQuit = 1;
        }
        return signalToQuit;
    }

    public static void printGoodbay() {
        System.out.println("Congratulations, " + User.getName() + "!");
    }

    public static int gamesCount() {
        final int games = 3;
        return games;
    }

}

