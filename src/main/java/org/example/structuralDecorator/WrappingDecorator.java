package org.example.structuralDecorator;

import org.example.Toy;

// Décorateur pour mes jouets (ajoute un papier cadeau) basé sur le décorateur abstrait (ToyDecorator)
public class WrappingDecorator extends ToyDecorator {
    public WrappingDecorator(Toy toy) {
        super(toy);
    }

    public String getDescription() {
        return super.getDescription() + ", ajout d'un papier cadeau";
    }

}
