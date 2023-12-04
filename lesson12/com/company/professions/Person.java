package lesson12.com.company.professions;

public class Person {

    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
