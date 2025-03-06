public class User {
    private int userId;
    private final String name;
    private String language;

    public User(int userId, String name, String language) {
        this.userId = userId;
        this.name = name;
        this.language = language;
    }

    public void createAccount() {
        System.out.println("Compte créé pour: " + name);
    }

    public void login() {
        System.out.println(name + " s'est connecté.");
    }

    public void disconnect() {
        System.out.println(name + " s'est déconnecté.");
    }
}