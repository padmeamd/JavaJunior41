package lesson4;
// программа на 10 лет (цикл в цикле)

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        for(int year = 0; year<10; year++){ // 1 круг = 1 год
            for(int month= 0; month<12; month++){
                for(int day = 0; day<31; day++){
                    for(int hour = 0; hour<24; hour++){
                        for(int min = 0; min<60; min++){
                            for(int sec = 0 ; sec<60; sec++)  {
                                System.out.println("The program started: "+ year+" years "+ month + " months "+day+" days "+ hour + " hours " + min +" mins "+ sec + " secs ");
                                Thread.sleep(1000);

                            }
                        }
                    }
                }
            }

        }

    }
}
