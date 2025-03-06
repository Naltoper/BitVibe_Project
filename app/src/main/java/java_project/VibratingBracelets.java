public class VibratingBracelets {
    private int braceletId;
    private boolean vibrationStatus;
    private boolean connectionStatus;
    private int vibrationIntensity;

    public VibratingBracelets(int braceletId) {
        this.braceletId = braceletId;
        this.connectionStatus = false;
        this.vibrationStatus = false;
    }

    public void connectBracelet() {
        this.connectionStatus = true;
        System.out.println("Bracelet connecté.");
    }

    public void sendVibration() {
        if (connectionStatus) {
            System.out.println("Vibration envoyée au bracelet " + braceletId);
        } else {
            System.out.println("Le bracelet n'est pas connecté.");
        }
    }
}
