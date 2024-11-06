package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static void start() {
        Engine.gameStart();
        int gamesCount = Engine.gamesCount();
        System.out.println("Find the greatest common divisor of given numbers.");
        String[][] arr = new String[gamesCount][2];
        int i = 0;
        while (i < gamesCount) {
            int random1 = Utils.generateRandom(Constant.NUMBERMAX19) + 1;
            int random2 = Utils.generateRandom(Constant.NUMBERMAX19) + 1;
            arr[i][0] = "Question: " + random1 + " " + random2;
            arr[i][1] = Integer.toString(gcd(random1, random2));
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

    public static int gcd(int a, int b) {
        return  (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

}
