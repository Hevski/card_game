import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
//    private SuitType[] suits;
//    private RankType[] ranks;

    public Deck(){
        this.cards = new ArrayList<Card>();
        this.populate();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int countCards() {
       return this.cards.size();
    }

    public void populate(){
        deckReplenish();
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                this.cards.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(this.cards);
    }

    public void deckReplenish(){
        this.cards = new ArrayList<Card>();
    }

    public Card dealCard() {
        return this.cards.remove(0);
    }
}
