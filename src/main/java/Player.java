import java.util.ArrayList;

public class Player {

    ArrayList<Card> hand;

    public Player(){
        hand = new ArrayList<Card>();
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }

    public int handSize() {
        return hand.size();
    }

    public int returnCardRank(){
        return hand.get(0).getRank().getValue();
    }
}
