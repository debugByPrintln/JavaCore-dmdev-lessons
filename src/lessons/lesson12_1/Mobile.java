package lessons.lesson12_1;

public class Mobile extends Computer{
    private int monitorDiagonal;

    public Mobile(int ssd, int ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("Mobile is loaded!");
    }
}
