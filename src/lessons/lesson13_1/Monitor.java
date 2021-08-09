package lessons.lesson13_1;

public class Monitor extends Screen{
    private String computerName;

    public Monitor(int diagonal, int resolution, String computerName) {
        super(diagonal, resolution);
        this.computerName = computerName;
    }

    @Override
    public void load(){
        System.out.println("Monitor is loaded!");
    }

    public void incrementResolution(){
        super.setResolution(super.getResolution()+1);
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }
}
