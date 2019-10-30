package sample;

public class Principle extends User {
    private College college;

    public Principle(String name, String email, College college) {
        this.setName(name);
        this.setEmail(email);
        this.college = college;
    }


}
