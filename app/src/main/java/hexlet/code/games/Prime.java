package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Prime {
    public static void start() {
        Engine.gameStart();
        int gamesCount = Engine.gamesCount();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[][] arr = new String[gamesCount][2];
        int i = 0;
        while (i < gamesCount) {
            int random = Utils.generateRandom(Constant.NUMBERMAX80);
            arr[i][0] = "Question: " + random;
            arr[i][1] = isPrime(random);
            int flagToExit = Engine.gameLogic(arr[i]);
            if (flagToExit == 1) {
                break;
            }
            i++;
        }
        if (i > gamesCount) {
            Engine.printGoodbay();
        }
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
}
