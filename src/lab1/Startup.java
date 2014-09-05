package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {

        HumanResource hr = new HumanResource();

        hr.hireEmployee(new Employee("Peter", "Piper", "333-1234"));

        for(Employee e: hr.getEmployees()) {
            System.out.println(e.getName() + " current status is: " + e.getStatus());
        }

    }
    
    
}
