package collection.injection.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Service("collectionInjectionAnnotation")
public class CollectionInjectionAnnotation {

    @Resource(name="utilAnnotationList")
    private List<String> myList;

    @Resource(name="utilAnnotationSet")
    private Set<Integer> mySet;

    //@Value(value="#{utilAnnotationMap}")
    //private Map<String,Object> myMap;

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Set<Integer> getMySet() {
        return mySet;
    }

    public void setMySet(Set<Integer> mySet) {
        this.mySet = mySet;
    }

    /*public Map<String, Object> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }*/

}
