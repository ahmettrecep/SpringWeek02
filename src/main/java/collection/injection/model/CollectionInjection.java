package collection.injection.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {

    private List<String> myList;
    private List<Employee> myEmployee;
    private Set<Integer> mySet;
    private Map<String,Object> myMap;
    private Properties myProperties;

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public List<Employee> getMyEmployee() {
        return myEmployee;
    }

    public void setMyEmployee(List<Employee> myEmployee) {
        this.myEmployee = myEmployee;
    }

    public Set<Integer> getMySet() {
        return mySet;
    }

    public void setMySet(Set<Integer> mySet) {
        this.mySet = mySet;
    }

    public Map<String, Object> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public Properties getMyProperties() {
        return myProperties;
    }

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }

    @Override
    public String toString() {
        return "CollectionInjection{" +
                "myList=" + myList +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                ", myProperties=" + myProperties +
                '}';
    }
}
