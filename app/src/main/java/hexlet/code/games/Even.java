package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void start() {
        Engine.gameStart();
        int gamesCount = Engine.gamesCount();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[][] arr = new String[gamesCount][2];
        int i = 0;
        while (i < gamesCount) {
            int random = Utils.generateRandom(Constant.NUMBERMAX80);
            arr[i][0] = "Question: " + random;
            arr[i][1] = getCorrectAnswer(random);
            int flagToExit = Engine.gameLogic(arr[i]);
            if (flagToExit == 1) {
                break;
            }
            i++;
        }
        if (i >= gamesCount) {
            Engine.printGoodbay();
        }
    }

    private static String getCorrectAnswer(int rand) {
        if (rand % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
