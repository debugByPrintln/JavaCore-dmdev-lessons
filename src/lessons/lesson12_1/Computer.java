package lessons.lesson12_1;

public class Computer {
    private int ssd;
    private int ram;

    public Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
