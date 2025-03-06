package java_project;

public class VibratingBracelets {
    private int braceletId;
    private boolean vibrationStatus;
    private boolean connectionStatus;

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
            vibrationStatus = true;
            System.out.println("Vibration envoyée au bracelet " + braceletId);
        } else {
            System.out.println("Le bracelet n'est pas connecté.");
        }
    }

    public void stopVibration(){
        vibrationStatus = false;
        System.out.println("Fin des vibrations.");
    }

    public boolean getVibrationStatus(){
        return this.vibrationStatus;
    }

    public boolean getConnectionStatus(){
        return this.connectionStatus;
    }
    public int getBraceletId(){
        return this.braceletId;
    }
}
