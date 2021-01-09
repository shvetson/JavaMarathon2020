package day11.task2;

public class Warrior extends Hero {
    private double health;
    private int physAtt;
    private double physDef;
    private double magicDef;

    public Warrior() {
        health = 100.0;
        physAtt = 30;
        physDef = 0.8;
        magicDef = 0.0;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    @Override
    public String toString() {
        return "Warrior {health=" + health + "}";
    }
}