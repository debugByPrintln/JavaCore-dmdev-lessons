package lessons.lesson19_15;

public class OffRoad extends Car{
    private boolean hasSafeTire;

    public OffRoad(String mark, String model, String year, Integer maxSpeed, boolean hasABS, boolean hasSafeTire) {
        super(mark, model, year, maxSpeed, hasABS);
        this.hasSafeTire = hasSafeTire;
    }

    public void replaceTire(){
        System.out.println(getMark() + " " + getModel() + "replaced a tire");
    }

    public boolean isHasSafeTire() {
        return hasSafeTire;
    }

    public void setHasSafeTire(boolean hasSafeTire) {
        this.hasSafeTire = hasSafeTire;
    }
}
