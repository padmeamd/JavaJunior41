package lesson7;

// ООП; Объект как тип;
//
public class Main {
    public static void main(String[] args) {
        // формула создания объекта определенного типа
        // Конструртор - особый метод, который вызывается после слова new
                      // вызов конструктора
        // в () можно указать входящие параметры при создании нового объекта (конструктора)
        Student vasilii = new Student(27,"Vasya","Moscow","89166963687");// создан новый объект типа студент
        Student peter = new Student(); // имена = ссылочки на эти объекты

        vasilii.setAge(28);
        peter.setAge(23);

        System.out.println(vasilii.getAge());
        System.out.println(peter.getAge());


    }
}
