package Pojos.student;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private int rollNo;
    private String fName;
    private String lName;
    private double percentage;

    private static final AtomicInteger rollNumberGenerator = new AtomicInteger(1);
    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public Student(String fName, String lName, double percentage) {
        this.rollNo = rollNumberGenerator.getAndIncrement();
        this.fName = fName;
        this.lName = lName;
        this.percentage = percentage;
    }



    public Student() {
        System.out.println("Default Constructor called");
    }
}
