package lesson7.homework;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иванов Иван Иванович", 29);

        person2.move("Иванов Иван Иванович");
        person1.talk("Орлова Евгения Викторовна");
    }
}
