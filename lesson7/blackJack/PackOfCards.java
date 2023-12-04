package lesson7.blackJack;

import java.util.concurrent.ThreadLocalRandom;

public class PackOfCards {
    Card[] cards = new Card[52];


    public void preparedPack(){
        // нужно создать 52 карты и поместить их в массив
        cards[0]= new Card("Two of clubs", 2);
        cards[1]= new Card("Two of diamonds", 2);
        cards[2]= new Card("Two of spades", 2);
        cards[3]= new Card("Two of hearts", 2);

        cards[4]= new Card("Three of clubs", 3);
        cards[5]= new Card("Three of diamonds", 3);
        cards[6]= new Card("Three of spades", 3);
        cards[7]= new Card("Three of hearts", 3);

        cards[8]= new Card("Four of clubs", 4);
        cards[9]= new Card("Four of diamonds", 4);
        cards[10]= new Card("Four of spades", 4);
        cards[11]= new Card("Four of hearts", 4);

        cards[12]= new Card("Five of clubs", 5);
        cards[13]= new Card("Five of diamonds", 5);
        cards[14]= new Card("Five of spades", 5);
        cards[15]= new Card("Five of hearts", 5);

        cards[16]= new Card("Six of clubs", 6);
        cards[17]= new Card("Six of diamonds", 6);
        cards[18]= new Card("Six of spades", 6);
        cards[19]= new Card("Six of hearts", 6);

        cards[20]= new Card("Seven of clubs", 7);
        cards[21]= new Card("Seven of diamonds", 7);
        cards[22]= new Card("Seven of spades", 7);
        cards[23]= new Card("Seven of hearts", 7);

        cards[24]= new Card("Eight of clubs", 8);
        cards[25]= new Card("Eight of diamonds", 8);
        cards[26]= new Card("Eight of spades", 8);
        cards[27]= new Card("Eight of hearts", 8);

        cards[28]= new Card("Nine of clubs", 9);
        cards[29]= new Card("Nine of diamonds", 9);
        cards[30]= new Card("Nine of spades", 9);
        cards[31]= new Card("Nine of hearts", 9);

        cards[32]= new Card("Ten of clubs", 10);
        cards[33]= new Card("Ten of diamonds", 10);
        cards[34]= new Card("Ten of spades", 10);
        cards[35]= new Card("Ten of hearts", 10);

        cards[36]= new Card("Ace of clubs", 11);
        cards[37]= new Card("Ace of diamonds", 11);
        cards[38]= new Card("Ace of spades", 11);
        cards[39]= new Card("Ace of hearts", 11);

        cards[40]= new Card("King of clubs", 11);
        cards[41]= new Card("King of diamonds", 11);
        cards[42]= new Card("King of spades", 11);
        cards[43]= new Card("King of hearts", 11);

        cards[44]= new Card("Queen of clubs", 11);
        cards[45]= new Card("Queen of diamonds", 11);
        cards[46]= new Card("Queen of spades", 11);
        cards[47]= new Card("Queen of hearts", 11);

        cards[48]= new Card("Jack of clubs", 11);
        cards[49]= new Card("Jack of diamonds", 11);
        cards[50]= new Card("Jack of spades", 11);
        cards[51]= new Card("Jack of hearts", 11);

    }
    // метод возвращает одну карту радномно; static не пишем;
    // Возвращаемый тип - карта(Card)
    public Card randomCard(){  // alt+ enter импортировать класс
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return cards[randomNum]; // вернем из метода карту
    }
}
