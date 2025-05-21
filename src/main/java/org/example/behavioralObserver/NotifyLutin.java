package org.example.behavioralObserver;

public class NotifyLutin implements Subject {
    @Override
    public void update(String event) {
        System.out.println("Nouvelle alerte :" + event);
    }
}
