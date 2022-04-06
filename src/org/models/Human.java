package org.models;

public class Human extends Humanoid{
    public Human(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String toString() {
        return "Human{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
