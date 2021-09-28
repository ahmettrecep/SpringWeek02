package collection.injection.test;

import collection.injection.model.CollectionInjectionAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;

public class CollectionInjectionAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collection.injection.annotation.xml");
        CollectionInjectionAnnotation collectionBean = applicationContext.getBean("collectionInjectionAnnotation", CollectionInjectionAnnotation.class);

        List<String> myList = collectionBean.getMyList();
        myList.forEach(System.out::println);
        System.out.println();

        Set<Integer> mySet = collectionBean.getMySet();
        mySet.forEach(System.out::println);

    }
}
