package lesson7.blackJack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BlackJack {
    // полем класса добавим колоду карт
    private PackOfCards packofCards = new PackOfCards();
    private ArrayList<Player> players = new ArrayList<>();



    // constructor
    public BlackJack(){
        packofCards.preparedPack();
    }

    public void addPlayerToGame(Player player){

        players.add(player);
    }


    public void dealTwoCardsToEachPlayer(){
        for (Player player : players) { // прошлись по всем игрокам и крупье
            player.addCardToHand(packofCards.randomCard()); // раздали ПЕРВУЮ карту
            player.addCardToHand(packofCards.randomCard()); // ВТОРУЮ
        }
    }

    public void dealTheRestOfTheCardsToEachPlayer(){
        for (Player player:players) { // прошлись по всем игрокам и крупье
            while (player.doYouNeedMoreCards()){ // проявление полиморфизма
                player.addCardToHand(packofCards.randomCard()); // дали карту на сохранение
            }

        }
    }

    public void printTheWinner(){
        /**  13  13  22 12 10  ------ выиграли 13 13
         *   24  26  22 22 23  ------ выиграл крупье
         *   24  26  21 21 21  ------ выиграл 21 21 21
         *   20  20  20 20 20  ------ выиграли все
         *   17  19  20 24 18  ------ выиграл 20
         */

// СТАВИМ ФЛАЖОК FALSE всем, у кого перебор
        for (Player player : players) {
            if(player.countValueInHand() > 21 ){
                player.setCanWin(false);

            }
        }
        if(countPlayersWhoCanWin() == 0){ // если у всех перебор, находим крупье и печатаем его карты
            for (Player player : players){
                if(player instanceof Dealer){ //  проверяем является ли объект экземпляром класса
                    System.out.println("The winner is " + player.getName());
                    player.showYourCards();
                    return; // выходим из метода, дальше проверки не нужны, победитель найден
                }
            }
        }

        /**  13  13  22 12 10  ------ выиграли 13 13
         *   24  26  21 21 21  ------ выиграл 21 21 21
         *   20  20  20 20 20  ------ выиграли все
         *   17  19  20 24 18  ------ выиграл 20
         */

        int valueOfTheWinner = 1;
        for (Player player : players) { // ищем максимальный балл (ближайший к 21), игрок должен быть еще в игре
            if(player.isCanWin() && player.countValueInHand() > valueOfTheWinner){
                valueOfTheWinner = player.countValueInHand();

            }
        }

        for (Player player : players) {
            if (player.countValueInHand() == valueOfTheWinner){
                System.out.println("The winner is " + player.getName());
                player.showYourCards();
            }

        }
    }
    public int countPlayersWhoCanWin(){
        int count = 0;
        for (Player player : players) {
            if(player.isCanWin()){
                count++;
            }

        }
        return count;
    }
}
