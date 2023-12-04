package lesson7;

public class Student {
    /** 1 - переменные / поля класса / свойства / характеристики
     *
     * 2 - Конструктор (особый метод, который вызывается в момент создания объекта после слова new)
     * по умолчанию конструктор пустой
     * Сколько может быть конструкторов в классе? Столько, сколько позволяют входящие данные
     *
     * 3 - методы; методов может как и не быть, так и много
     */

    private int age;
    private String fullName;
    private String address;
    private String phoneNumber;


    // Пишем конструктор " public Student"
    public Student(){ // пустой конструктор класса всегда должен существовать, если мы добавляем еще конструктор(ы)

    }

    //Ниже пишем другой конструктор

    public Student(int age, String fullName, String address, String phoneNumber){
        this.age = age;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }
// Основные правила ООП
    // Инкапсуляция - управление доступом/ управление областью видимости
    // В ООП переменные должны быть ВСЕГДА private !!!!
    // (модификаторы доступа : public/protected/private/___);
    // правильно поставить модификатор доступа перед переменными
    // ______________________________________________
    //
    // метод будет устанавливать студенту возразт
    public void setAge(int age){
        this.age = age; // this = обращение "я";
    }// static не пишется, если static поставим к васе и пете не сможем поставить, только объекту Student
    // на каждое поле должен быть установлен метод SET
    // А также возвращаемый тип с GET-ом


    // узнать возраст
    public int getAge(){
        return age;

    }


}
