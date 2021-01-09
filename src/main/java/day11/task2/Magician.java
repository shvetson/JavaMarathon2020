package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private double health;
    private int physAtt;
    private int magicAtt;
    private double physDef;
    private double magicDef;

    public Magician() {
        health = 100.0;
        physAtt = 5;
        magicAtt = 20;
        physDef = 0.0;
        magicDef = 0.8;
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

    public double getMagicDef() {return magicDef;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    @Override
    public String toString() {
        return "Magician {health=" + health + "}";
    }

    @Override
    public void magicalAttack(Hero hero) {
        double newHealth = hero.getHealth() - (magicAtt * (1 - hero.getMagicDef()));
        if (newHealth > 0) {
            hero.setHealth(newHealth);
        } else {
            hero.setHealth(0);
        }
        System.out.println(hero);
    }
}