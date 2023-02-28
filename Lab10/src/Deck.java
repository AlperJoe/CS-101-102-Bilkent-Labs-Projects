
public class Deck {

    //array of Cards(52)
    private Card [] deck = new Card [52];

    //index of the first unplayed Cards in the deck
    private int topCard;

    //constructor
    public Deck(){

        //creates a deck and initialize 52 cards
        deck = new Card[52];
        initialize();
        //shuffles the deck
        shuffle();
        //initialize topCart to zero
        topCard = 0;
    }

    //getters
    public Card [] getDeck(){return deck;}
    public int getTopCard(){return topCard;}

    //creates a card and stores them in the deck
    public void initialize(){
        int counter = 0;
        for (int suit = 1; suit < 5; suit++){
            for(int value = 1; value < 14; value++){
                deck[counter] = new Card(suit, value);
                counter++;
            }
        }
    }

    //shuffle the deck
    public void shuffle() {

        //swap 1000 times
        for(int i = 0; i < 1000; i++){
            //choose two random index(card) from the deck
            int card1 = (int)(52 * Math.random());
            int card2 = (int)(52 * Math.random());

            //create temporary card to transfer correctly
            Card cardTemp = deck[card1];
            deck[card1] = deck[card2];
            deck[card2] = cardTemp;
        }
    }

    //when a card drawn top card must be changed
    public Card dealCard(){
        topCard ++;
        return deck[topCard - 1];
    }

    //string representation of all cards
    public String toString(){
        String s1;
        s1= "";

        for (int i = 0; i < deck.length; i++){
            s1 += deck[i];
            System.out.println();
        }
        return s1;
    }
}
