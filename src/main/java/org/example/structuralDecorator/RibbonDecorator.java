package org.example.structuralDecorator;

import org.example.Toy;

//Décorateur pour mes jouets (ajoute un ruban) basé sur mon decorateur abstrait (ToyDecorator)
public class RibbonDecorator extends ToyDecorator {
    public RibbonDecorator(Toy toy) {
        super(toy);
    }

    public String getDescription() {
        return toy.getDescription()+", ajout d'un ruban";
    }

}
