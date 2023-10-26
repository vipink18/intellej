package Stream.String;


public class Employee {
    private double empSal;
    private int empAge;
    private int empExp;
    private String empDesignation;


    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getEmpExp() {
        return empExp;
    }

    public void setEmpExp(int empExp) {
        this.empExp = empExp;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empSal=" + empSal +
                ", empAge=" + empAge +
                ", empExp=" + empExp +
                ", empDesignation=" + empDesignation +
                '}';
    }

    public Employee(double empSal, int empAge, int empExp, String empDesignation) {
        this.empSal = empSal;
        this.empAge = empAge;
        this.empExp = empExp;
        this.empDesignation = null;
    }

    public Employee() {}
}

