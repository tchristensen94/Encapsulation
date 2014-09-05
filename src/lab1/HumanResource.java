package lab1;

import java.util.LinkedList;

/**
 * Created by Timothy on 9/4/2014.
 */
public class HumanResource {

    LinkedList<Employee> employees = new LinkedList<Employee>();

    public HumanResource() {}


    public void hireEmployee(Employee e) {
        e.meetDepartmentStaff();
        e.meetWithHrForBenefitAndSalryInfo();
        e.reviewDeptPolicies();
        employees.add(e);
    }
    public void fireEmployee(Employee e) {
        employees.remove(e);
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }
}
