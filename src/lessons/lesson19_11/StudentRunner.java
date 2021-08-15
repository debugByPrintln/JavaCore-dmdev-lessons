package lessons.lesson19_11;

import java.util.*;

public class StudentRunner {
    public static void main(String[] args) {
        Student[] array = new Student[]{
                new Student("Ivan", "Ivanov", 19, 4.5),
                new Student("Petr", "Petrov", 20, 3.6),
                new Student("Sveta", "Svetova", 19, 4.9),
                new Student("Anton", "Antonov", 21, 3.2)
        };
        List<Student> students = new ArrayList<Student>(Arrays.asList(array));

        System.out.println(students);

        System.out.println(findBestStudent(students));
//        Student student = new Student();

//        students.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName)
//        .thenComparing(Student::getAge).thenComparing(Student::getAvgPoint));
//
//        System.out.println(students);

        Collections.sort(students); // возможен еще вариант с классом компаратора но Student implements comparable
        System.out.println(students);
    }


    private static class CompareByAll implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            int stringComparing = (o1.getFirstName() + o1.getLastName()).compareTo(o2.getFirstName() + o2.getLastName());
            return (int) (stringComparing + (o1.getAge() - o2.getAge()) + (o1.getAvgPoint() - o2.getAvgPoint()));
        }
    }

    private static Student findBestStudent(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        Student bestStudent = null;
        double pointCounter = 0;
        while (iterator.hasNext()){
            Student currentStudent = iterator.next();
            if (currentStudent.getAvgPoint() > pointCounter){
                pointCounter = currentStudent.getAvgPoint();
                bestStudent = currentStudent;
            }
        }
        return bestStudent;
    }
}
