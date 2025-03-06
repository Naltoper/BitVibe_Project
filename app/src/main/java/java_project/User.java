package java_project;

public class User {
    private final int userId;
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

    // Getter for userId
    public int getUserId() {
        return userId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    
    public String getLanguage() {
        return this.language;
    }
}