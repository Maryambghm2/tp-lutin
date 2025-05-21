package org.example.creationalFactory;

import org.example.Toy;

public class CarFactory extends ToyFactory{

    @Override
    public Toy createToys() {
        return new Car();
    }
}
