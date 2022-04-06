package org.models;

public abstract class Being extends SpacialElement implements Comparable<Being>{
    private int maxHealth =100;
    protected int health;
    protected double resistance;

    public Being(String name, int x, int y) {
        super(name, x, y);
    }

    public Being(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y);
        this.maxHealth = maxHealth;
        this.health = health;
        this.resistance = resistance;
    }

    public void receiveDamage(int amount){

    }

    @Override
    public int compareTo(Being o) {
        if (this.health<o.health){
            return 1;
        }else if (this.health>o.health){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Being{" +
                "maxHealth=" + maxHealth +
                ", health=" + health +
                ", resistance=" + resistance +
                '}';
    }
}
