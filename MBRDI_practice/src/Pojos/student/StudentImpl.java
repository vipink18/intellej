package Pojos.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentImpl {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vipin","Katiyar",82.2));
        studentList.add(new Student("Kshitiz","Zamindar",95.3));
        studentList.add(new Student("Harshit","Dawane",88.2));
        studentList.add(new Student("Suraj","Arya",92.4));
        studentList.add(new Student("Dev","Singh",94.1));
        studentList.add(new Student("Manisha","Dangi",82.5));
        studentList.add(new Student("Tavneet","Singh",86.8));
        studentList.add(new Student("Vipin","Dane",89.9));


        Collections.sort(studentList,new StudentSortByPercentage());
        System.out.println("sort by percentage");
        studentList.forEach(System.out::println);

        Collections.sort(studentList,new StudentSortByFname());
        System.out.println("sort by first name");
        studentList.forEach(System.out::println);

        Collections.sort(studentList, Comparator.comparing(Student::getlName));
        System.out.println("sort by last name");
        studentList.forEach(System.out::println);

        Collections.sort(studentList, Comparator.comparingDouble(Student::getPercentage).reversed());
        System.out.println("sort by percentage");
        studentList.forEach(System.out::println);

        studentList.stream().sorted(Comparator.comparingInt(Student::getRollNo)).forEach(System.out::println);

    }
}
