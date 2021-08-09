package lessons.lesson18_2.weapons;

import lessons.lesson11_1.Point;
import lessons.lesson18_2.weapons.heroes.Warrior;

public class Runner {
    public static void main(String[] args) {
        Warrior<Sword> warrior = new Warrior<>("Aragorn");
        warrior.setWeapon(new Sword());
        System.out.println(warrior.toString());
    }
}
