package Pojos.student;

import java.util.Comparator;

public class StudentSortByPercentage implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return  (int)(o2.getPercentage() - o1.getPercentage());

    }
}
