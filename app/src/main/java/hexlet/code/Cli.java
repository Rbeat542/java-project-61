package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void ask() {
        Scanner in = new Scanner(System.in);
        var user = new User("");
        System.out.print("May I have your name? ");
        String name = in.next();
        user.setName(name);
        System.out.println("Hello, " + name + "!");
        //System.out.println(userX.getName());   // check for getter and setter work
        in.close();
    }
}
