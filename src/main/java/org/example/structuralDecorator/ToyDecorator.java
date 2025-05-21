package org.example.structuralDecorator;

import org.example.Toy;

// Décorateur abstrait pour les jouets (va permettre de créer des décorateurs concrets pour un jouet)
public abstract class ToyDecorator implements Toy {
    protected Toy toy;

    public ToyDecorator(Toy toy) {
        this.toy = toy;
    }

    @Override
    public String getDescription() {
        return toy.getDescription();
    }
}
