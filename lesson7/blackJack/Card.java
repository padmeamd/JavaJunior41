package lesson7.blackJack;

import java.util.Objects;

public class Card {
    private String denomination;
    private int value;

    public Card(){

    }
    // создаем конструктор
    public Card(String denomination, int value){
        this.denomination = denomination;
        this.value = value;

    }
    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (value != card.value) return false;
        return Objects.equals(denomination, card.denomination);
    }

    @Override
    public int hashCode() {
        int result = denomination != null ? denomination.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return denomination;
    }
}
