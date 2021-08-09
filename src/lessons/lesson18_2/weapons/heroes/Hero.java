package lessons.lesson18_2.weapons.heroes;

public class Hero<T> {
    private String name;
    private T weapon;

    public Hero(String name){
        this.name = name;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
