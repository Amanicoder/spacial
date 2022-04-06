package org.models;

public abstract class SpacialElement {
    private String name;
    protected int x;
    protected int y;

    public SpacialElement(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "SpacialElement{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
