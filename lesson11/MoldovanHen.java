package lesson11;

public class MoldovanHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 24;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Молдова . Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
