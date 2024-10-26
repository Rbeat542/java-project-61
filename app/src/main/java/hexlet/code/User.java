package hexlet.code;

class User {
    private String name;
    User(String name) {
        this.name = name;
    }

    public void setName(String nameIn) {
        this.name = nameIn;
    }

    public String getName() {
        return this.name;
    }
}
