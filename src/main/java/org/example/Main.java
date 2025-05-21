package org.example;

import org.example.behavioralObserver.*;
import org.example.creationalFactory.*;
import org.example.structuralDecorator.PlainToy;
import org.example.structuralDecorator.RibbonDecorator;
import org.example.structuralDecorator.WrappingDecorator;

public class Main {
    public static void main(String[] args) {

        // Création jouet basique (sans décoration) :
        Toy baseToy = new PlainToy();

        // Création jouet avec ajout ruban :
        Toy rubanToy = new RibbonDecorator(baseToy);

        // Création jouet avec ajout papier cadeau :
        Toy wrappingToy = new WrappingDecorator(rubanToy);

        // Lutin qui sera en production
        Subject lutin1 = new NotifyLutin();

        // Lutin qui sera en decoration
        Subject lutin2 = new NotifyLutin();


        // Création alerte
        ProductionLine productionLine = new ProductionLine();
        productionLine.addLutin(lutin1);

        DecorationLine decorationLine = new DecorationLine();
        decorationLine.addLutin(lutin2);


        // Essai avec poupée
        ToyFactory dollFactory = new DollFactory();
        Toy doll = dollFactory.createToys();
//        System.out.println(doll.getDescription());

        // Alerte production lutin
        productionLine.produceToy(doll);

        Toy decoratedDoll = new RibbonDecorator(doll);

        // Alerte décoration lutin
        decorationLine.decorateToy(doll, "ruban");

//        System.out.println(doll.getDescription() + ",  décoration : " + baseToy.getDescription());
//
//        System.out.println(doll.getDescription() + ", décoration : " + rubanToy.getDescription());


        // Essai avec car
        ToyFactory carFactory = new CarFactory();
        Toy car = carFactory.createToys();
        productionLine.produceToy(car);

        Toy decoratedCar = new WrappingDecorator(car);

        decorationLine.decorateToy(car, "papier cadeau");

//        System.out.println(car.getDescription() + ", décoration : "+ wrappingToy.getDescription());


        // Essai avec Monopoly
        ToyFactory monopolyFactory = new MonopolyFactory();
        Toy monopoly = monopolyFactory.createToys();

        productionLine.produceToy(monopoly);
//        System.out.println(monopoly.getDescription()+ ", décoration : "+ rubanToy.getDescription());



    }
}