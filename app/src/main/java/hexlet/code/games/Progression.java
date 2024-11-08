package hexlet.code.games;

import hexlet.code.util.Constant;
import hexlet.code.Engine;
import hexlet.code.util.Utils;

public class Progression {
    public static void start() {
        Engine.gameStart();
        System.out.println("What number is missing in the progression?");
        Engine.gameLogic(getAllData());
    }

    private static String createProgression(int number1, int number2) {
        int[] arrayOfInt = new int[Constant.PROGRLENGTH - 1];
        String stringToDisplay = "";
        final int digitsInRow = 9;
        for (int i2 = 0; i2 < digitsInRow; i2++) {
            arrayOfInt[i2] = number1 + i2;
            if (i2 == number2) {
                stringToDisplay = stringToDisplay + " " + "..";
            } else {
                stringToDisplay = stringToDisplay + " " + arrayOfInt[i2];
            }
        }
        stringToDisplay = stringToDisplay.trim();
        return stringToDisplay;
    }

    private static String[][] getAllData() {
        String[][] arr = new String[Constant.GAMESTOPLAY][2];
        for (int i = 0; i < Constant.GAMESTOPLAY; i++) {
            final int random1 = Utils.generateRandom(Constant.NUMBERMAX80);
            final int random2 = Utils.generateRandom(Constant.PROGRLENGTH);
            arr[i][0] = "Question: " + createProgression(random1, random2);
            arr[i][1] = Integer.toString(random1  + random2);
        }
        return arr;
    }
}
