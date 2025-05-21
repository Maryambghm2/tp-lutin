package org.example.behavioralObserver;

import org.example.Toy;
import org.example.creationalFactory.Doll;
import org.example.creationalFactory.DollFactory;
import org.example.creationalFactory.ToyFactory;

public class Main {

    public static void main(String[] args) {
        UpdateManager updateManager = new UpdateManager();

        Subject lutin1 = new NotifyLutin();
        Subject lutin2 = new NotifyLutin();
        Subject lutin3 = new NotifyLutin();

        updateManager.addLutin(lutin1);
        updateManager.addLutin(lutin2);
        updateManager.addLutin(lutin3);


        ProductionLine productionLine = new ProductionLine();
        productionLine.addLutin(lutin1);
        productionLine.addLutin(lutin2);

        ToyFactory dollFactory = new DollFactory();
        Toy doll = dollFactory.createToys();
        productionLine.produceToy(doll);




//        System.out.println(lu;);

    }

}
