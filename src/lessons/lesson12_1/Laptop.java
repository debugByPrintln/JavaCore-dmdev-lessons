package lessons.lesson12_1;

public class Laptop extends Computer{
    private int weight;

    public Laptop(int ssd, int ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }


    @Override
    public void load() {
        System.out.println("Laptop is loaded!");
    }
}
