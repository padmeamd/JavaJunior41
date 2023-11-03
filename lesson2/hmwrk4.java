package lesson2;

public class hmwrk4 {
    public static void main(String[] args) {
        int goal = 200000; // Желаемая сумма в рублях
        int monthlySaving = 9500; // Сумма, которую откладываем ежемесячно в рублях
        int totalSaving = 0; // Итоговая накопленная сумма
        int months = 0; // Количество месяцев

        for (int i = 0; totalSaving < goal; i++) {
            totalSaving += monthlySaving;
            months++;
        }

        double years = months/ 12.0 ; // Количество лет

        System.out.println("Необходимо " + years + " лет, чтобы собрать сумму в 200000 рублей.");
        // При компиляции почему-то неправильно считает, не знаю, в чем проблема
    }
}
