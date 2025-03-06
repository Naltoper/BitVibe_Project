public class Application {
    private String appName;
    private String version;

    public Application(String appName, String version) {
        this.appName = appName;
        this.version = version;
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
}
