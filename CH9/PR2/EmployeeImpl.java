package CH9.PR2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl {


    private static Employee[] employeeArray = new Employee[10];


    EmployeeImpl() {
    }


    public void add(Employee emp) throws InvalidOperationException {
        if (employeeArray[emp.getId()] != null) {
            throw new InvalidOperationException("Error adding employee , employee id already exists " + emp.getId());
        }
        try {
            employeeArray[emp.getId()] = emp;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidOperationException("Error adding employee , id must be less than " + employeeArray.length);
        }
    }


    public void delete(int id) throws InvalidOperationException {
        if (employeeArray[id] == null) {
            throw new InvalidOperationException("Error deleting employee, no such employee " + id);
        }
        try {
            employeeArray[id] = null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidOperationException("Error deleting employee, id must be less than " + employeeArray.length);
        }
    }


    public Employee findById(int id) throws InvalidOperationException {
        try {
            return employeeArray[id];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidOperationException("Error finding employee ", e);
        }
    }


    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();

        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
}
