ublic class BraceletsSettings {
    private int frequency;
    private int vibrationIntensity;

    public  BraceletsSettings(int frequency, int vibrationIntensity) {
        this.frequency = frequency;
        this.vibrationIntensity = vibrationIntensity;
    }

    public void updateSettings(int newFrequency, int newIntensity) {
        this.frequency = newFrequency;
        this.vibrationIntensity = newIntensity;
        System.out.println("Paramètres mis à jour.");
    }
}