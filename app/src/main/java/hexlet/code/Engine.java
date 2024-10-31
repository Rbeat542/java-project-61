package hexlet.code;

import hexlet.code.games.*;
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
        } else if (gameName.equals("Calcgame")) {   // how to move class and method as parameter istead of 'switch' use ?
            Calcgame.gameLogic(name);
        } else if (gameName.equals("Gcdgame")) {   // how to move class and method as parameter istead of 'switch' use ?
            Gcdgame.gameLogic(name);
        } else if (gameName.equals("Progressiongame")) {   // how to move class and method as parameter istead of 'switch' use ?
            Progressiongame.gameLogic(name);
        } else if (gameName.equals("Primegame")) {   // how to move class and method as parameter istead of 'switch' use ?
            Primegame.gameLogic(name);
        }
    }
}
