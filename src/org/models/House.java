package org.models;

public class House extends SpacialElement{
    private Humanoid h;
    private Ematerial ematerial;
    private int price;

    public House(String name, int x, int y) {
        super(name, x, y);
    }

    public House(String name, int x, int y, Ematerial ematerial, int price) {
        super(name, x, y);
        this.ematerial = ematerial;
        this.price = price;
    }
}
