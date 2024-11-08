package hexlet.code.games;

import hexlet.code.util.Constant;
import hexlet.code.Engine;
import hexlet.code.util.Utils;

public class Gcd {
    public static void start() {
        Engine.gameStart();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.gameLogic(getAllData());
    }

    public static int gcd(int a, int b) {
        return  (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

    private static String[][] getAllData() {
        String[][] arr = new String[Constant.GAMESTOPLAY][2];
        for (int i = 0; i < Constant.GAMESTOPLAY; i++) {
            int random1 = Utils.generateRandom(Constant.NUMBERMAX19) + 1;
            int random2 = Utils.generateRandom(Constant.NUMBERMAX19) + 1;
            arr[i][0] = "Question: " + random1 + " " + random2;
            arr[i][1] = Integer.toString(gcd(random1, random2));
        }
        return arr;
    }
}
