package hexlet.code.games;

import hexlet.code.util.Constant;
import hexlet.code.Engine;
import hexlet.code.util.Utils;

public class Even {
    public static void start() {
        Engine.gameStart();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.gameLogic(getAllData());
    }

    private static String getCorrectAnswer(int rand) {
        if (rand % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    private static String[][] getAllData() {
        String[][] arr = new String[Constant.GAMESTOPLAY][2];
        for (int i = 0; i < Constant.GAMESTOPLAY; i++) {
            int random = Utils.generateRandom(Constant.NUMBERMAX80);
            arr[i][0] = "Question: " + random;
            arr[i][1] = getCorrectAnswer(random);
        }
        return arr;
    }
}
