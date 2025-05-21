package org.example;

import org.example.behavioralObserver.NotifyLutin;
import org.example.behavioralObserver.ProductionLine;
import org.example.behavioralObserver.Subject;
import org.example.behavioralObserver.UpdateManager;
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

        Subject lutin1 = new NotifyLutin();

        // Création alertes
//        UpdateManager updateManager = new UpdateManager();
//        updateManager.addLutin(lutin1);
//        System.out.println(lutin1);
        ProductionLine productionLine = new ProductionLine();
        NotifyLutin notifyLutin = new NotifyLutin();



        // Essai avec poupée
        ToyFactory dollFactory = new DollFactory();
        Toy doll = dollFactory.createToys();
        productionLine.produceToy(doll);
        System.out.println(doll.getDescription());

        Toy decoratedDoll = new RibbonDecorator(doll);
        productionLine.decorateToy(decoratedDoll, "ruban");

        System.out.println(doll.getDescription() + ",  décoration : " + baseToy.getDescription());

        System.out.println(doll.getDescription() + ", décoration : " + rubanToy.getDescription());


        // Essai avec car
        ToyFactory carFactory = new CarFactory();
        Toy car = carFactory.createToys();
        System.out.println(car.getDescription() + ", décoration : "+ wrappingToy.getDescription());


        // Essai avec Monopoly
        ToyFactory monopolyFactory = new MonopolyFactory();
        Toy monopoly = monopolyFactory.createToys();

        System.out.println(monopoly.getDescription()+ ", décoration : "+ rubanToy.getDescription());



    }
}