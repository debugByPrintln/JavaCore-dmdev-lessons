package lessons.lesson19_15;

public class SportCar extends Car{
    private Integer horsePower;

    public SportCar(String mark, String model, String year, Integer maxSpeed, boolean hasABS, Integer horsePower) {
        super(mark, model, year, maxSpeed, hasABS);
        this.horsePower = horsePower;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}
