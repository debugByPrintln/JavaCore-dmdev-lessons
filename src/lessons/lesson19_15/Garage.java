package lessons.lesson19_15;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    Map<Car, Integer> carsInGarage = new HashMap<>();

    public Garage() {
        carsInGarage.put(new Sedan(), 0);
    }

    public Map<Car, Integer> getCarsInGarage() {
        return carsInGarage;
    }

    public void setCarsInGarage(Map<Car, Integer> carsInGarage) {
        this.carsInGarage = carsInGarage;
    }
}
