package org.example.behavioralObserver;

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



//        System.out.println(lu;);

    }

}
