import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    ArrayList<Player> players;
    Player player1;
    Player player2;
    Player player3;
    Game game;

    @Before
    public void setup() {
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        game = new Game(players);

    }

    @Test
    public void testDeckCount() {
        assertEquals(52, deck.getCardCount());
    }

    @Test
    public void canShuffleDeck() {
        deck.printCards();
        deck.shuffle();
        deck.printCards();
    }

    @Test
    public void canDealOneCard(){
        deck.dealOne();
        assertEquals(51, deck.getCardCount());
    }

    @Test
    public void canAddToPlayerHand() {
        player1.addCardToHand(deck.dealOne());
        assertEquals(1, player1.handSize());
    }

    @Test
    public void canDealCards() {
        game.dealCards(deck);
        assertEquals(1,player1.handSize());
        assertEquals(1,player2.handSize());
        assertEquals(1,player3.handSize());
    }

    @Test
    public void canPlayGame() {
        game.dealCards(deck);
        assertEquals(player1,game.pickWinner());
    }

    @Test
    public void canPlayGameShuffled() {
        deck.shuffle();
        game.dealCards(deck);
        System.out.println(game.pickWinner());
    }
}
