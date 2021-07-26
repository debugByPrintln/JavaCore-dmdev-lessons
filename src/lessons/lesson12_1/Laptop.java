package lessons.lesson12_1;

public class Laptop extends Computer{
    public int ssd;

    public Laptop(int ssd, int ram, int ssd1) {
        super(ssd, ram);
        this.ssd = ssd1;
    }

    public int getSsd() {
        return ssd;
    }
}
