package lessons.lesson11_1;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){

        // Pythagoras theorem
        double xLen = Math.abs(this.x - point.getX());
        double yLen = Math.abs(this.y - point.getY());
        return Math.sqrt(Math.pow(xLen, 2) + Math.pow(yLen, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
