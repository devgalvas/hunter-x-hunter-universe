package br.edu.unifei.hunterproject.Hunters;

public class PhysicalTraining implements Training{
    
    @Override
    public void trainingSession() {
        System.out.println("Physical training session");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Training session has ended unexpectedly.");
            Thread.currentThread().interrupt();
        }
    }
}
