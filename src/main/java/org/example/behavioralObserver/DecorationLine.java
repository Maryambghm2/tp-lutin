package org.example.behavioralObserver;

import org.example.Toy;

public class DecorationLine extends UpdateManager{

    public void decorateToy(Toy toy, String decoration) {
        notifyLutin("Décoration ajoutée: " + decoration);
    }

}

