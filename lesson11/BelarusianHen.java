package lesson11;

public class BelarusianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Беларусь . Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
