package Pojos.student;

import java.util.Comparator;

public class StudentSortByFname implements Comparator<Student> {

    public int compare(Student o1,Student o2){
        if(o1.getfName().equals(o2.getfName())){
            return o1.getlName().compareTo(o2.getlName());
        }
        return o1.getfName().compareTo(o2.getfName());
    }
}
