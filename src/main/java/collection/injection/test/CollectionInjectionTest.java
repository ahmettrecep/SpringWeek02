package collection.injection.test;

import collection.injection.model.CollectionInjection;
import collection.injection.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjectionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collection.injection.xml");
        CollectionInjection collectionBean = applicationContext.getBean("collectionInjectionId", CollectionInjection.class);
        List<String> myList = collectionBean.getMyList();
        myList.stream().forEach(System.out::println);

        List<Employee> myEmployees = collectionBean.getMyEmployee();
        myEmployees.stream().forEach(System.out::println);

        System.out.println("Set");
        Set<Integer> numbers = collectionBean.getMySet();
        numbers.stream().forEach(System.out::println);

        System.out.println("Map");
        Map<String,Object> myMap = collectionBean.getMyMap();
        myMap.forEach((k,v)-> System.out.println("key : " + k + " value: " + v));

        System.out.println("Properties");
        Properties props = collectionBean.getMyProperties();
        myMap.forEach((k,v)-> System.out.println("key : " + k + " value: " + v));
    }
}