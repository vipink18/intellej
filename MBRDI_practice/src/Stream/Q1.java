package Stream;

import java.sql.SQLOutput;

class Q1 {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Q1() {

            new Q1(0, null, null,0.0);
            System.out.println("In default constructor of Q1");

        }

    @Override
    public String toString() {
        return "Q1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private Q1(int id, String name, String department, double salary){
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }



    public static void main(String[] args) {

    }
}
