import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;

    public Game(ArrayList<Player> players){
        this.players = players;

    }

    public void dealCards(Deck deck){
        for (Player player : players ){
        player.addCardToHand(deck.dealOne());
        }
    }

    public Player pickWinner(){
        Player winner = new Player();

        for(Player player : players){

            if(winner.handSize() == 0){
                winner = player;
            }

            if(player.returnCardRank() > winner.returnCardRank()){
                winner = player;
            }

        }
        return winner;

    }
}
