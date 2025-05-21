package org.example.creationalFactory;

import org.example.Toy;

public class MonopolyFactory extends ToyFactory {


    @Override
    public Toy createToys() {
        return new Monopoly();
    }
}
