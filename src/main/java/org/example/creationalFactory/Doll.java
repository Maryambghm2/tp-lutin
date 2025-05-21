package org.example.creationalFactory;

import org.example.Toy;

public class Doll implements Toy {
    @Override
    public String getDescription() {
     //   System.out.println("Poupée en plastique");
        return "Poupée en plastique";
    }
}
