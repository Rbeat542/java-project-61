package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class Engine {
    public static void gamestart(String gameName, String question) {
        Scanner in2 = new Scanner(System.in);
        var user = new User("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String str = in2.nextLine();
        user.setName(str);
        var name = user.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        int i = 1;
        int flagToExit = 0;
        final int gamesCount = 3; // задан верхний предел количества попыток игры
        while (i <= gamesCount) {
            if (gameName.equals("Evengame")) {   // how to move class as parameter istead of 'if ' or 'switch' use ???
                if (Even.gameLogic(name) == 1) {
                    break;
                }
            } else if (gameName.equals("Gcdgame")) {
                if (Gcd.gameLogic(name) == 1) {
                    break;
                }
            } else if (gameName.equals("Progressiongame")) {
                if (Progression.gameLogic(name) == 1) {
                    break;
                }
            } else if (gameName.equals("Primegame")) {
                if (Prime.gameLogic(name) == 1) {
                    break;
                }
            } else if (gameName.equals("Calcgame")) {
                if (Calc.gameLogic(name) == 1) {
                    break;
                }
            }
            i++;
        }
        if (i > gamesCount) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
