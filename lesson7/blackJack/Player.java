package lesson7.blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private String name;
    private ArrayList<Card> hand = new ArrayList<>();

    private boolean canWin = true;


    public void setName(String name){
        this.name = name;
    }

    public void addCardToHand(Card card) { // добавляем в руку карту, которую нам дали
        hand.add(card);
    }

    public boolean doYouNeedMoreCards() {
        System.out.println( name + ", your cards are ------>" );
        showYourCards();
        System.out.println("--------------------");
        System.out.println("Do you need one more card?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("Yes")){
            return true;
        }
        return false;
    }

    public void showYourCards(){
        for (Card card:hand) {
            System.out.println(card);

        }
    }

    public int countValueInHand(){
        int count = 0;
        for (Card card: hand) {

            count = count +card.getValue();

        }
        return count;
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
}
