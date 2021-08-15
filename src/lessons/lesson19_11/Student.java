package lessons.lesson19_11;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private Integer age;
    private double avgPoint;

    public Student(String firstName, String lastName, int age, double avgPoint) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", avgPoint=" + avgPoint +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public int compareTo(Student o) {
        int stringComparing = (getFirstName() + getLastName()).compareTo(o.getFirstName() + o.getLastName());
        return (int) (stringComparing + (getAge() - o.getAge()) + (getAvgPoint() - o.getAvgPoint()));
    }
}
