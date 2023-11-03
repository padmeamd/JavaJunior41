package lesson2;

public class Main5 {
    public static void main(String[] args) {
        // Вывести на консоль числа от 30 до 3000 кратные 3м и 6ти и 15ти (делятся на три без остатка и пять без остатка)
        for (int i = 30; i <= 3000; i++ ){
            // прописываем, что остатка нет (равен 0 )
            if(i % 3 == 0 && i % 6 == 0 && i % 15 == 0){
                System.out.println(i);

            }


        }
    }
}
