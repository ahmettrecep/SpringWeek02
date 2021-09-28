package setter.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import setter.injection.model.Employee;

public class EmployeeSetterInjectionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setter.injection.xml");
        Employee employee = applicationContext.getBean("employeeId", Employee.class);
        System.out.println(employee);
        Employee employee2 = applicationContext.getBean("employeeId2", Employee.class);
        System.out.println(employee2);
    }
}
