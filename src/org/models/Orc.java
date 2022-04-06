package org.models;

public class Orc extends Humanoid{
    public Orc(String name, int x, int y) {
        super(name, x, y);
    }

    public Orc(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }
}
