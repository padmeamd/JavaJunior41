package lesson2;

public class hmwrk5 {
    public static void main(String[] args) {
        for (int i = 20; i <=60;i++){
            if (i>=30 && i<=40){ // условие проверяет,находится ли i в диапазоне
                // если условие выполняется( значение i лежит в указанном диапазоне)
                continue;// выполнение операции прерывается с помощью оператора continue
            }
            System.out.println(i);    }
        }

}
