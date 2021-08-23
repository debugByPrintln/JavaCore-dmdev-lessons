package lessons.lesson23_1;

import java.io.Serial;
import java.io.Serializable;

public class Student extends Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 8333383891046702227L;

    private int number;

    public Student(int age, String firstName, String lastName, int number) {
        super(age, firstName, lastName);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                "} " + super.toString();
    }
}
