package lessons.lesson11_1;

public class Rectangle {
    private Point topLeftCorner;
    private Point bottomRightCorner;

    public Rectangle(Point topLeftCorner, Point bottomRightCorner) {
        this.topLeftCorner = topLeftCorner;
        this.bottomRightCorner = bottomRightCorner;
    }

    public double countArea(){
        double a = Math.abs(this.bottomRightCorner.getX() - this.topLeftCorner.getX());
        double b = Math.abs(this.topLeftCorner.getY() - this.bottomRightCorner.getY());
        return a * b;
    }

    public double countDiagonalLength(){
        return this.topLeftCorner.distance(this.bottomRightCorner);
    }

    public Point getTopLeftCorner() {
        return topLeftCorner;
    }

    public Point getBottomRightCorner() {
        return bottomRightCorner;
    }

    public void setTopLeftCorner(Point topLeftCorner) {
        this.topLeftCorner = topLeftCorner;
    }

    public void setBottomRightCorner(Point bottomRightCorner) {
        this.bottomRightCorner = bottomRightCorner;
    }
}
