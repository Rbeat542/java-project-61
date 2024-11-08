package hexlet.code.util;

import hexlet.code.User;
import java.util.Scanner;

public class Cli {
    public static void ask() {
        Scanner inCli = new Scanner(System.in);
        var user = new User("");
        System.out.print("May I have your name? ");
        String name = inCli.next();
        user.setName(name);
        System.out.println("Hello, " + name + "!");
        inCli.close();
    }
}
