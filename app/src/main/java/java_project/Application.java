package java_project;

public class Application {
    private String appName;
    private String version;

    public Application(String appName, String version) {
        this.appName = appName;
        this.version = "1.0";
    }

    public void launchApp() {
        System.out.println("Application " + appName + " lancée.");
    }

    public void connectUser(User user) {
        user.login();
    } 

    public void displayBitcoinPrice(BitcoinPrice price) {
        System.out.println("Prix actuel du Bitcoin: " + price.getCurrentPrice());
    }

    //Getters
    public String getVersion(){
        return this.version;
    }
}
