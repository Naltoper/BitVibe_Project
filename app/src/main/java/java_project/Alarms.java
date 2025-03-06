public class Alarms {
    private int alarmId;
    private double triggerPrice;
    private int alarmIntensity;

    public Alarms(int alarmId, double triggerPrice, int alarmIntensity) {
        this.alarmId = alarmId;
        this.triggerPrice = triggerPrice;
        this.alarmIntensity = 5;
    }

    public void sendAlarm() {
        System.out.println("Alerte! Bitcoin atteint " + triggerPrice);
    }
    public void configureIntensity(int newIntensity) {
        this.alarmIntensity = newIntensity;
        System.out.println(" Intensité de l'alarme réglée sur : " + newIntensity);
    }
    public void setTriggerPrice(double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }
    public double getTriggerPrice() {
        return triggerPrice;
    }
    public int getAlarmIntensity() {
        return alarmIntensity;
    }
}
