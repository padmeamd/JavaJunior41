package lesson3;

public class Main3 {
    public static void main(String[] args) {
        char[] abcd ={'a','b','c','d'};
        char[] qwer ={'q','w','e','r'};

        char[] abcdqwer = new char[abcd.length + qwer.length];

     /*   abcdqwer[0]= abcd[0];
        abcdqwer[1]= abcd[1];
        abcdqwer[2]= abcd[2];
        abcdqwer[3]= abcd[3];

        abcdqwer[4]= qwer[0]; // 4-4 = 0 // i - abcd.length
        abcdqwer[5]= qwer[1]; // 5 - 4 = 1
        abcdqwer[6]= qwer[2]; // 6- - 4 = 2
        abcdqwer[7]= qwer[3]; // 7 - 4 = 3 */

        for(int i =0; i<abcdqwer.length; i++){
            if(i< abcd.length ){// сохранение из первого массива
                abcdqwer[i]= abcd[i];
            } else { // сохранение из второго массива
                abcdqwer[i]= qwer[ i - abcd.length];
            }
            System.out.println(abcdqwer[i]);
        }

    }
}
