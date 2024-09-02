package org.example.patterns.Adapter;

public class Clothes implements Walk{
    private Human human;

    public Clothes(Human human) {
        this.human = human;
    }

    @Override
    public void walk() {
        System.out.println("I use clothes for a walk!");
    }
}
