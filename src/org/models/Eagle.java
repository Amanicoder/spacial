package org.models;

public class Eagle extends Animal{
    public int vision;

    public Eagle(String name, int x, int y) {
        super(name, x, y);
    }

    public Eagle(String name, int x, int y, int vision) {
        super(name, x, y);
        this.vision = vision;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", vision=" + vision +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
