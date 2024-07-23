package java8_features.streams.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
          new Employee("Nilesh","IT",10000),
          new Employee("John","HR",78000),
          new Employee("Alice","Finance",45000),
                new Employee("Annu","Finance",65000),
                new Employee("Ganu","HR",5000)

        );

        //Group employee by department
        //Map<String, List<Employee>> groupBy =employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        //System.out.println(groupBy);

        //partitioningBy()
        Map<Boolean, List<Employee>> partitioning = employees.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary() > 50000));

        System.out.println("Employees with salary > 50000");
        partitioning.get(true).forEach(System.out::println);

        System.out.println();

        System.out.println("Employee with salary < 50000");
        partitioning.get(false).forEach(System.out::println);



    }
}
