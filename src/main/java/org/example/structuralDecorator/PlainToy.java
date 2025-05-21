package org.example.structuralDecorator;

import org.example.Toy;

// Jouet de base sans décoration qui respecte l'interface Toy
public class PlainToy implements Toy {
    @Override
    public String getDescription() {
        return "Jouet de base";
    }
}
