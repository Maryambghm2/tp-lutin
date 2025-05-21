package org.example.creationalFactory;

import org.example.Toy;

public class DollFactory extends ToyFactory{
    @Override
    public Toy createToys() {
        return new Doll();
    }
}
