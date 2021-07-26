package lessons.lesson11_1;

public class AppRunner {
    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(3, 13);
        System.out.println("Testing point.distance method A: (3, 4) B: (3, 13) : " + a.distance(b) + "\n" +
                "-------------------------------------------------------------------------------");

        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(10, 10));
        System.out.println("Given rectangle is A: (0, 0) B: (10, 10) (a simple square) \n" +
                            "Diagonal length of rectangle: " + rectangle.countDiagonalLength() + "\n" +
                            "Area of the rectangle: " + rectangle.countArea());
    }
}
