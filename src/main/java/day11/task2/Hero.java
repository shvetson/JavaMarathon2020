package day11.task2;

public abstract class Hero implements PhysAttack{
    private double health;
    private int physAtt;
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

    public double getPhysAtt() {
        return physAtt;
    }

    public void physicalAttack(Hero hero) {
        double newHealth = hero.getHealth() - (this.getPhysAtt() * (1 - hero.getPhysDef()));
        if (newHealth > 0) {
            hero.setHealth(newHealth);
        } else {
            hero.setHealth(0);
        }
        System.out.println(hero);
    }
}