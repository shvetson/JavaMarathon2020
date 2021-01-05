package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);
        shaman.healTeammate(magician);
        magician.magicalAttack(paladin);
        shaman.physicalAttack(warrior);
        paladin.healHimself();

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
        }
    }
}