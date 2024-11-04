package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void printStartQuestion(String greet) {
        System.out.println(greet);
    }

    public static void gameStart(String greet) {
        var user = new User("");
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner in2 = new Scanner(System.in);
        String str = in2.nextLine();
        user.setName(str);
        System.out.println("Hello, " + user.getName() + "!");
        System.out.println(str);
        printStartQuestion(greet);
    }

    public static int compareAnswers(String[] answers) {
        String userAnswer = answers[0];
        String correctAnswer = answers[1];
        int signalToQuit = 0;
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(.");
            System.out.println("Correct answer was '" + correctAnswer + "'");
            System.out.println("Let's try again, " + User.getName() + "!");
            signalToQuit = 1;
        }
        return signalToQuit;
    }

    public static void printGoodbay() {

        System.out.println("Congratulations, " + User.getName() + "!");
    }
}
