package hexlet.code.games;

import hexlet.code.util.Constant;
import hexlet.code.util.Utils;
import hexlet.code.Engine;

public class Prime {
    public static void start() {
        Engine.gameStart();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.gameLogic(getAllData());
    }
    private static String isPrime(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    private static String[][] getAllData() {
        String[][] arr = new String[Constant.GAMESTOPLAY][2];
        for (int i = 0; i < Constant.GAMESTOPLAY; i++) {
            int random = Utils.generateRandom(Constant.NUMBERMAX80);
            arr[i][0] = "Question: " + random;
            arr[i][1] = isPrime(random);
        }
        return arr;
    }
}
