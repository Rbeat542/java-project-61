package hexlet.code.games;

import hexlet.code.util.Constant;
import hexlet.code.Engine;
import hexlet.code.util.Utils;
import java.util.Random;

public class Calc {
    public static void start() {
        Engine.gameStart();
        System.out.println("What is the result of the expression?");
        Engine.gameLogic(getAllData());
    }

    public static String getCorrectAnswer(int operator1, int operator2, String operation) {
        int calculation = 0;
        switch (operation) {
            case "+":
                calculation = operator1 + operator2;
                break;
            case "*":
                calculation = operator1 * operator2;
                break;
            case "-":
                calculation = operator1 - operator2;
                break;
            default:
                break;
        }
        return Integer.toString(calculation);
    }

    private static String getRandomOperator() {
        Random rand = new Random();
        String[] operationsArray = {"+", "-", "*"};
        final int random3 = rand.nextInt(3);
        return operationsArray[random3];
    }

    private static String[][] getAllData() {
        String[][] arr = new String[Constant.GAMESTOPLAY][2];
        for (int i = 0; i < Constant.GAMESTOPLAY; i++) {
            String operation = getRandomOperator();
            int random1 = Utils.generateRandom(Constant.NUMBERMAX10);
            int random2 = Utils.generateRandom(Constant.NUMBERMAX10);
            arr[i][0] = "Question: " + random1 + " " + operation + " " + random2;
            arr[i][1] = getCorrectAnswer(random1, random2, operation);
        }
        return arr;
    }
}
