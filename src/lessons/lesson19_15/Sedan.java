package lessons.lesson19_15;

public class Sedan extends Car{
    private Integer trunkCapacity;

    public Sedan(String mark, String model, String year, Integer maxSpeed, boolean hasABS, Integer trunkCapacity) {
        super(mark, model, year, maxSpeed, hasABS);
        this.trunkCapacity = trunkCapacity;
    }

    public Sedan() {
    }

    public void openTrunk(){
        System.out.println(getMark() + " " + getModel() + "opened trunk");
    }

    public Integer getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(Integer trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }


}
