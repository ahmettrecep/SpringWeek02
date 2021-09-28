package setter.injection.model;

public class Employee {
    private String name;
    private String surname;
    private long salary;
    private int birtYear;
    private char gender;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getBirtYear() {
        return birtYear;
    }

    public void setBirtYear(int birtYear) {
        this.birtYear = birtYear;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", birtYear=" + birtYear +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }
}
