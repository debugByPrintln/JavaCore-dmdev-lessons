package lessons.lesson18_2.weapons.heroes;

import lessons.lesson18_2.weapons.DarkKnightSword;
import lessons.lesson18_2.weapons.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T>{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public String toString() {
        String returning;
        if (super.getWeapon() instanceof DarkKnightSword){
            returning = "Warrior has a dark knight sword!";
        }
        else {
            returning = "A simple sword!";
        }
        return returning;

    }
}
