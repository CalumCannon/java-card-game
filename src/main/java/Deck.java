import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;

public class Deck {

    ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
        this.generateCards();
    }

    public void generateCards(){
        //loop Suit
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public int getCardCount() {
        return cards.size();
    }

    public void printCards() {
        for (Card card : cards) {
            System.out.println(card.getRank() + " " + card.getSuit());
        }
    }

    public void shuffle() {
        Arrays.asList(cards);
        Collections.shuffle(cards);
    }

    public Card dealOne(){
        Card card = cards.get(0);
        cards.remove(card);
        return card;

    }

}
