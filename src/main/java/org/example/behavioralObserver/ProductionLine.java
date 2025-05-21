package org.example.behavioralObserver;

import org.example.Toy;

public class ProductionLine extends UpdateManager {
public void produceToy(Toy toy) {
    notifyLutin("Jouet produit :"+ toy.getDescription());
}

    public void decorateToy(Toy toy, String decoration) {
        notifyLutin("Décoration ajoutée: " + decoration);
    }

}
