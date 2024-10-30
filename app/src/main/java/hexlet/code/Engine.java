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

        for (var i = 1; i < 4; i++) {
            switch (gameName) {   // how to move class and method as parameter istead of 'switch' use ?
                case "Evengame":
                    Evengame.gameLogic(name);
                    break;
                case "Calcgame":
                    Calcgame.gameLogic(name);
                    break;
                case "Gcdgame":
                    Gcdgame.gameLogic(name);
                    break;
                case "Progressiongame":
                    Progressiongame.gameLogic(name);
                    break;
                case "Primegame":
                    Primegame.gameLogic(name);
                    break;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
