package lesson3;
//Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}
// Вывести на консоль через ячейку
public class Task1 {
    public static void main(String[] args) {
        int[] givenArray = {3,5,8,3,55,4,1,65,36,98};
        for(int i = 0; i < givenArray.length; i +=2){ // i +=2 считаем через одну ячейку
            System.out.println(givenArray[i]);
        }
    }
}