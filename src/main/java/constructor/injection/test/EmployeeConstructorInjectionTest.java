package constructor.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import constructor.injection.model.Employee;

public class EmployeeConstructorInjectionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructor.injection.xml");
        Employee employee = applicationContext.getBean("employeeId1", Employee.class);
        System.out.println(employee);
        Employee employee2 = applicationContext.getBean("employeeId2", Employee.class);
        System.out.println(employee2);
        Employee employee3 = applicationContext.getBean("employeeId3", Employee.class);
        System.out.println(employee3);
    }
}
