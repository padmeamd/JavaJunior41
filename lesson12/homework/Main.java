package lesson12.homework;
//Создать массив типа Student,
// содержащий объекты класса Student и Aspirant.
// Вызвать метод getScholarship() для каждого элемента массива.
public class Main {
    public static void main(String[] args) {

        Student[] array = new Student[5];

        array[0] = new Student("Ivan","Ivanov","SKO11",3.5);
        array[1] = new Aspirant("Alexandra","Petrova","M21", 5.0,"Design in Filmmaking");
        array[2] = new Student("Maria","Sobchak","PO11",4.5);
        array[3] = new Aspirant("Maksim","Morozov","TO21", 4.3,"City Farming Technologies");
        array[4] = new Aspirant("Lubov","Loginova","M21", 3.0,"Design of Web pages");

        /** array[0].getScholarship();
        array[1].getScholarship();
        array[2].getScholarship();
        array[3].getScholarship();
        array[4].getScholarship(); **/

        for (Student currentScholarship: array) {
            currentScholarship.getScholarship();

        }

    }
}
