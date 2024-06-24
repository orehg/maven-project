package streams_practic;

import java.util.Objects;

public class Employee {
    private String department;
    private int salary;

    public Employee(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return salary == employee.salary && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, salary);
    }

    @Override
    public String toString() {
        return "Employee " +
                "department = " + department + '\'' +
                ", salary = " + salary;
    }
}
