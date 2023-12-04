package lesson10;

import java.util.Objects;

public class Student {
    private String fullName;
    private int age;
    private int scholarship;

    public Student(){

    }
    public Student(String fullName, int age, int scholarship) {
        this.fullName = fullName;
        this.age = age;
        this.scholarship = scholarship;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override // переопределение метода родительского класса

    public boolean equals(Object o) {
        // Olga будет доступна как Object o
        // Dasha - this
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
// Преобразование типов
        // int a = 9;
        // byte b = (byte) a;
        Student student = (Student) o; //


        if (this.age != student.age) return false;
        if (this.scholarship != student.scholarship) return false;
        return Objects.equals(this.fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        int result = this.fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + scholarship;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "full name='" + fullName + '\'' +
                ", age=" + age +
                ", scholarship size=" + scholarship +
                '}';
    }
}
