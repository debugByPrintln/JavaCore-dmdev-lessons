package lessons.lesson13_1;

public class Screen {
    private int diagonal;
    private int resolution;

    public Screen(int diagonal, int resolution) {
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    public void load(){
        System.out.println("Screen is loaded!");
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getResolution() {
        return resolution;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
