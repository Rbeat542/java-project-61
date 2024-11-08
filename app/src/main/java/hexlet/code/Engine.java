package hexlet.code;

import hexlet.code.util.Constant;

import java.util.Scanner;

public class Engine {

    public static void gameStart() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner in2 = new Scanner(System.in);
        String str = in2.nextLine();
        User.setName(str);
        System.out.println("Hello, " + User.getName() + "!");
    }

    public static void gameLogic(String[][] arr) {
        int i = 0;
        Scanner in = new Scanner(System.in);
        int flagToExit = 0;
        while (i < Constant.GAMESTOPLAY) {
            System.out.println(arr[i][0]);
            System.out.print("Your answer: ");
            String input = in.nextLine();
            flagToExit = Engine.checkAnswer(arr[i][1], input);
            if (flagToExit == 1) {
                break;
            }
            i++;
            if (i >= Constant.GAMESTOPLAY) {
                Engine.printGoodbay();
            }
        }
    }

    public static void printGoodbay() {
        System.out.println("Congratulations, " + User.getName() + "!");
    }

    public static int checkAnswer(String correctAnswer, String input) {
        int signalToQuit = 0;
        if (correctAnswer.equals(input)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + input + "'" + " is wrong answer ;(.");
            System.out.println("Correct answer was '" + correctAnswer + "'");
            System.out.println("Let's try again, " + User.getName() + "!");
            signalToQuit = 1;
        }
        return signalToQuit;

    }
}

