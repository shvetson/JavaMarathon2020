package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private double health;
    private int physAtt;
    private int magicAtt;
    private double physDef;
    private double magicDef;
    private final double VALUE_HEALTH_HIMSELF = 50;
    private final double VALUE_HEALTH_TEAMMATE = 30;

    public Shaman() {
        health = 100.0;
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
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
        return "Shaman {health=" + health + "}";
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