package br.edu.unifei.hunterproject.Hunters;

public class NenTraining implements Training{
    private int intensity;
    private int duration; // milliseconds

    @Override
    public void trainingSession() {
        System.out.println("Nen training session begins");
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            System.err.println("Training session has ended unexpectedly.");
            Thread.currentThread().interrupt();
        }
        System.out.println("Nen training session ends. The user has become stronger.");
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
