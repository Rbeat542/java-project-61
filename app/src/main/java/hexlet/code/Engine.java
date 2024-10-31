package hexlet.code;

import hexlet.code.games.Calcgame;
import hexlet.code.games.Evengame;
import hexlet.code.games.Gcdgame;
import hexlet.code.games.Progressiongame;
import hexlet.code.games.Primegame;
import java.util.Scanner;

public class Engine {
    public static void game(String gameName, String question) {
        Scanner in2 = new Scanner(System.in);
        var user = new User("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String str = in2.nextLine();
        user.setName(str);
        var name = user.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        if (gameName.equals("Evengame")) {   // how to move class and method as parameter istead of 'switch' use ?
            Evengame.gameLogic(name);
        } else if (gameName.equals("Calcgame")) {
            Calcgame.gameLogic(name);
        } else if (gameName.equals("Gcdgame")) {
            Gcdgame.gameLogic(name);
        } else if (gameName.equals("Progressiongame")) {
            Progressiongame.gameLogic(name);
        } else if (gameName.equals("Primegame")) {
            Primegame.gameLogic(name);
        }
    }
}
