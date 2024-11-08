package hexlet.code;

public class User {
    private static String name;
    public User(String pname) {
        this.name = pname;
    }

    public static void setName(String nameIn) {
        User.name = nameIn;
    }

    public static String getName() {
        return name;
    }
}
