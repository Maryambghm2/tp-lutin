package org.example.creationalFactory;

import org.example.Toy;

public class Car implements Toy {
    @Override
    public String getDescription() {
       // System.out.println("Voiture en plastique.");
        return "Voiture en plastique ";
    }
}
