package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void game() {
        Engine.gamestart("Gcdgame", "Find the greatest common divisor of given numbers.");
    }

    public static int gameLogic(String nameOfUser) {
        var rand = new Random();
        Scanner in = new Scanner(System.in);
        int signalToQuitLoop = 0;
        final int upperLimit = 19; // задан верхний предел для генерации чисел, чтобы не быть сложным для подсчета.
        var random1 = rand.nextInt(upperLimit) + 1;  // избавляемся от 0 после генерации случайного числа
        var random2 = rand.nextInt(upperLimit) + 1;
        int answer = 0;
        int flagOfInt = 1;
        String textAnswer = "";
        System.out.println("Question: " + random1 + " " + random2);
        System.out.print("Your answer: ");
        if (in.hasNextInt()) {
            answer = in.nextInt();
        } else {
            textAnswer = in.next();
            //System.out.println("Извините, но это не число. Попробуйте снова!");
            flagOfInt = 0;
        }
        int result = gcd(random1, random2);
        if (answer == result) {
            System.out.println("Correct!");
        } else {
            errorDisplay(answer, textAnswer, result, flagOfInt);
            System.out.println("Let's try again, " + nameOfUser + "!");
            signalToQuitLoop = 1;
        }
        return signalToQuitLoop;
    }


    public static void errorDisplay(int answer2, String textAnswer2, int result2,  int flag2) { //new
        if (flag2 == 1) {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(.");
        } else {
            System.out.println("'" + textAnswer2 + "'" + " is wrong answer ;(.");
        }
        System.out.println("Correct answer was '" + result2 + "'");
    }

    public static int gcd(int a, int b) {  //метод взят с hexlet
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

}

