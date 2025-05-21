package org.example.behavioralObserver;

import java.util.ArrayList;
import java.util.List;

public class UpdateManager {
    private List<Subject> lutins = new ArrayList<>();

    public void addLutin(Subject lutin) {
        lutins.add(lutin);
    }

    public void removeLutin(Subject lutin) {
        lutins.remove(lutin);
    }

    public void createEvent(String nameEvent) {
        notifyLutin(nameEvent);
    }

    public void notifyLutin(String event) {
        for (Subject lutin : lutins) {
            lutin.update(event);
        }
    }


}
