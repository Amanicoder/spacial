package org.models;

public class Dragon extends Animal{
    private int power;
    private int range;

    public Dragon(String name, int x, int y) {
        super(name, x, y);
    }

    public Dragon(String name, int x, int y, int power, int range) {
        super(name, x, y);
        this.power = power;
        this.range = range;
    }


    @Override
    public String toString() {
        return "Dragon{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", power=" + power +
                ", range=" + range +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
