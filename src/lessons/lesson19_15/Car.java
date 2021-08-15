package lessons.lesson19_15;

import java.util.Objects;

public abstract class Car {
    private String mark;
    private String model;
    private String year;
    private Integer maxSpeed;
    private boolean hasABS;

    public Car() {
    }

    public Car(String mark, String model, String year, Integer maxSpeed, boolean hasABS) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.hasABS = hasABS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", hasABS=" + hasABS +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return hasABS == car.hasABS && Objects.equals(mark, car.mark) && Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(maxSpeed, car.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, year, maxSpeed, hasABS);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }
}
