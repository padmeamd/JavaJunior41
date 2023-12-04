package lesson11;

public class Main {
        public static void main(String[] args) {
            Hen hen = HenFactory.getHen("Беларусь"); // проявление пораждающего шаблона Factory
            hen.getCountOfEggsPerMonth();
            System.out.print(hen.getDescription());
        }
    }

