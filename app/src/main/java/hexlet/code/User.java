package hexlet.code;

class User {
    private String name;
    User(String pname) {
        this.name = pname;
    }

    public void setName(String nameIn) {
        this.name = nameIn;
    }

    public String getName() {
        return this.name;
    }
}
