package org.models;

public abstract class Animal extends Being{
    private Humanoid human;

    public Animal(String name, int x, int y) {
        super(name, x, y);
    }

    public Animal(String name, int x, int y, Humanoid human) {
        super(name, x, y);
        this.human = human;
    }
}
