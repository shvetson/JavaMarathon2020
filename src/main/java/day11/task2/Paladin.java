package day11.task2;

public class Paladin extends Hero implements Healer {
    private double health;
    private int physAtt;
    private double physDef;
    private double magicDef;
    private final double VALUE_HEALTH_HIMSELF = 25;
    private final double VALUE_HEALTH_TEAMMATE = 10;

    public Paladin() {
        health = 100;
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
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
        return "Paladin {health=" + health + "}";
    }

    @Override
    public void healHimself() {
        double newHealth = health + VALUE_HEALTH_HIMSELF;
        if (newHealth < 100) {
            health = newHealth;
        } else {
            health = 100;
        }
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        double newHealth = hero.getHealth() + VALUE_HEALTH_TEAMMATE;
        if (newHealth < 100) {
            hero.setHealth(newHealth);
        } else {
            hero.setHealth(100);
        }
        System.out.println(hero);
    }
}
