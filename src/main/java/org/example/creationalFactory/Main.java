package org.example.creationalFactory;

import org.example.Toy;

public class Main {
    public static void main(String[] args) {
        // Jouet Type Doll

        // Implémenter créateur de jouet poupée :
        ToyFactory dollFactory = new DollFactory();

        // Créer un jouet de type poupée
        Toy barbie = dollFactory.createToys();

        // Affichage description propre au type de jouet
        barbie.getDescription();


        // Jouet Type Car :

        // Implémenter créateur de jouet car :
        ToyFactory carFactory = new CarFactory();

        // Créer un jouet de type car
        Toy cars = carFactory.createToys();

        // Affichage description propre au type de jouet
        cars.getDescription();


        // Jouet Type Monopoly :

        // Implémenter créateur de jouet monopoly :
        ToyFactory monopolyFactory = new MonopolyFactory();

        // Créer un jouet de type monopoly
        Toy monopoly = monopolyFactory.createToys();

        // Affichage description propre au type de jouet
        monopoly.getDescription();

    }
}
