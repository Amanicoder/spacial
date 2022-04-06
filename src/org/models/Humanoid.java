package org.models;

public abstract class Humanoid extends Being{

    public Humanoid(String name, int x, int y) {
        super(name, x, y);
    }

    public Humanoid(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }
}
