package streams_practic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Work {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Research", 2000),
                new Employee("Management", 3000),
                new Employee("Management", 2700),
                new Employee("Research", 2500));

        Map<String, Double> averageSalaryForDepartment = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,
                                Collectors.averagingInt(Employee::getSalary)));

        averageSalaryForDepartment.forEach((department, averageSalary) ->
                System.out.println(department + ": average salary: " + averageSalary)
        );
    }
}
