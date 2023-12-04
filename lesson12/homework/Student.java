package lesson12.homework;

import java.util.Objects;

public class Student {

    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;


    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    // GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    // Equals and HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.averageMark, averageMark) != 0) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        if (!Objects.equals(lastName, student.lastName)) return false;
        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        temp = Double.doubleToLongBits(averageMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // МЕТОД, который возвращает сумму стипендии.
    // Если средняя оценка студента равна 5, то сумма 2000 руб, иначе 1900.
    // Переопределить этот метод в классе Aspirant.
    // Если средняя оценка аспиранта равна 5, то сумма 2500 руб, иначе 2200.
    public void getScholarship(){
        int scholarship;
        if(averageMark == 5) {
            scholarship = 2000;
        }else{
            scholarship = 1900;
            }
        System.out.println("Full name: "+ firstName + " " + lastName + " ---> " + "Scholarship: " + scholarship + " RUB; ");
        }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
