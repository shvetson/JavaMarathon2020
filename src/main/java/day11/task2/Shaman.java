package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private double health;
    private int physAtt;
    private int magicAtt;
    private double physDef;
    private double magicDef;
    private double valueHealthHimself = 50;
    private double valueHealthTeammate = 30;

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

    @Override
    public String toString() {
        return "Shaman {health=" + health + "}";
    }

    @Override
    public void physicalAttack(Hero hero) {
        double newHealth = hero.getHealth() - (physAtt * (1 - hero.getPhysDef()));
        if (newHealth > 0) {
            hero.setHealth(newHealth);
        } else {
            hero.setHealth(0);
        }
        System.out.println(hero);
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
        double newHealth = health + valueHealthHimself;
        if (newHealth < 100) {
            health = newHealth;
        } else {
            health = 100;
        }
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        double newHealth = hero.getHealth() + valueHealthTeammate;
        if (newHealth < 100) {
            hero.setHealth(newHealth);
        } else {
            hero.setHealth(100);
        }
        System.out.println(hero);
    }
}