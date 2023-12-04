package lesson12.homework;

import java.util.Objects;

public class Aspirant extends Student {

    public String scientificWork;



    // CONSTRUCTOR
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    // Getter and Setter for scientificWork
    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    // Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;

        return Objects.equals(scientificWork, aspirant.scientificWork);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (scientificWork != null ? scientificWork.hashCode() : 0);
        return result;
    }

    // Переопределить этот метод в классе Aspirant.
    // Если средняя оценка аспиранта равна 5, то сумма 2500 руб, иначе 2200.
    public void getScholarship(){
        int scholarship;
        if(averageMark == 5) {
            scholarship = 2500;
        }else{
            scholarship = 2200;
        }
        System.out.println("Full name: "+ firstName + " " + lastName + " ---> " + "Scholarship: " + scholarship + " RUB; ");
    }


}
