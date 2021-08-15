package lessons.lesson20_3;

public class ExceptionsRunner {

    public static void main(String[] args) {
//        try {
//            System.out.println(threeExceptions());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            System.out.println(halfChanceToThrow() + " " + "Try block");
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("Catch block");
        }
        finally {
            System.out.println("Finally block");
        }

    }

    private static int halfChanceToThrow() throws MyException {
        int i = getRandomNumber(1, 3);
        if (i == 1){
            throw new MyException("My Exception");
        }
        return i;
    }

    private static int threeExceptions() throws Exception {
        int i = getRandomNumber(1, 10);
        if (i >= 1 && i <=3){
            throw new MyException("1");
        }

        else if (i >=4 && i <= 6){
            throw new MyException2("2");
        }

        else {
            throw new MyException3("3");
        }
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
