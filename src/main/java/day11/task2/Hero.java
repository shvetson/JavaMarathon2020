package day11.task2;

public abstract class Hero {
    private double health;
    private int physAtt;
    private int magicAtt;
    private double physDef;
    private double magicDef;

    public Hero() {
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
}
