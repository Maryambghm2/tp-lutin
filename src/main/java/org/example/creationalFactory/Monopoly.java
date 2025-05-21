package org.example.creationalFactory;

import org.example.Toy;

public class Monopoly implements Toy {
    @Override
    public String getDescription() {
        // System.out.println("Jeu de société ou les joueurs achètent des propriétés.");
        return "Jeu de société ou les joueurs achètent des propriétés";
    }
}
