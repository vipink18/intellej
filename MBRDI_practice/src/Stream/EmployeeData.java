package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeData {
    public static void main(String[] args) {

        Employee employee = new Employee(1,"Suraj");
        Employee employee1 = new Employee(2,"Arya");

        List<Employee> list = Arrays.asList(employee,employee1);
        Map<Integer,String> map= list.stream().collect(Collectors.toMap(Employee::getEid, Employee::getEname));
        System.out.println(map);
    }
        }
