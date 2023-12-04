package lesson7.blackJack;
// создаем сценарий игры
// 1) создаем трех игроков
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Dealer dealer = new Dealer();

        player1.setName("Vasilii");
        player2.setName("Peter");
        player3.setName("Angela");
        dealer.setName("The dealer");

        BlackJack blackJack = new BlackJack();// уже создана и подготовлена колода карт
        // new BlackJack = constructor бращаемся к конструктору
        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(player3);
        blackJack.addPlayerToGame(dealer);


        blackJack.dealTwoCardsToEachPlayer();
        blackJack.dealTheRestOfTheCardsToEachPlayer();

        blackJack.printTheWinner();



    }
}
