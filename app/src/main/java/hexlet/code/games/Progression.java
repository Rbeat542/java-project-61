package hexlet.code.games;

import hexlet.code.Constant;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void start() {
        Engine.gameStart();
        int gamesCount = Engine.gamesCount();
        System.out.println("What number is missing in the progression?");
        String[][] arr = new String[gamesCount][2];
        int i = 0;
        while (i < gamesCount) {
            final int random1 = Utils.generateRandom(Constant.NUMBERMAX80);
            final int random2 = Utils.generateRandom(Constant.PROGRLENGTH);
            arr[i][0] = "Question: " + createProgression(random1, random2);
            arr[i][1] = Integer.toString(random1  + random2);
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

}
