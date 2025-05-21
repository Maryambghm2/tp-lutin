package org.example.structuralDecorator;

import org.example.Toy;


public class Main {

    public static void main(String[] args) {

        // Création jouet basique (sans décoration) :
        Toy baseToy = new PlainToy();
        System.out.println(baseToy.getDescription());

        // Création jouet avec ajout ruban :
        Toy rubanToy = new RibbonDecorator(baseToy);
        System.out.println(rubanToy.getDescription());

        // Création jouet avec ajout papier cadeau :
        Toy wrappingToy = new WrappingDecorator(rubanToy);
        System.out.println(wrappingToy.getDescription());


    }

}
