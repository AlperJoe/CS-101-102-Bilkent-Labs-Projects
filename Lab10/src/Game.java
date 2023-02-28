import java.util.Scanner;

public class Game {

    //deck of cards
    private Deck gameDeck;

    //array of cards, max length of 11
    private Card [] playerHand = new Card[11];

    //array of cards, max length of 11
    private Card [] dealerHand = new Card[11];

    //current number of Cards in the Player's hand
    private int playerCards;

    //current number of Cards in the Player's hand
    private int dealerCards;

    //constructor
    public Game(){

       //initialize the game deck
       gameDeck = new Deck();

       //initialize the player hand and dealer hand to empty arrays
       playerHand = new Card[11];
       dealerHand = new Card[11];

       //initialize the player cards and dealer cards to zero
       playerCards = 0;
       dealerCards = 0;
    }

    //getters
    public Deck getGameDeck(){return gameDeck;}
    public Card [] getPlayerHand(){return playerHand;}
    public Card [] getDealerHand(){return dealerHand;}
    public int getPlayerCards(){return playerCards;}
    public int getDealerCards(){return dealerCards;}

    //print hands
    public void printHand(String s1){

        //print player hand
        if(s1.equals("Player")){
            for(int i = 0; i < playerCards; i++ ){
                System.out.println(playerHand[i]);
            }
        }
        //print dealer hand
        else{
            for(int i = 0; i < dealerCards; i++ ){
                System.out.println(dealerHand[i]);
            }
        }
    }

    //determines and displays the result of the game
    public void determineResult(){

        //initialize the sum values
        int sumPlayerCards = 0;
        int sumDealerCards = 0;

        //calculate the sum of player cards
        for(int i = 0; i < playerCards; i++){
            sumPlayerCards += playerHand[i].getValue();
        }
        //calculate the sum of dealer cards
        for(int i = 0; i < dealerCards; i++){
            sumDealerCards += dealerHand[i].getValue();
        }

        //print the sum of both hands
        System.out.println("Player:" + sumPlayerCards +
                " Dealer:" + sumDealerCards);

        //if player achieve 21 player wins
        if(sumPlayerCards == 21){
            System.out.println("Congrats - You win!");
        }
        //if player going over 21 player immediately loses
        else if(sumPlayerCards > 21){
            System.out.println("Sorry - you lose");
        }
        //if dealer going over 21 dealer lose
        else if(sumDealerCards > 21){
            System.out.println("Congrats - You win!");
        }
        //if none of above is provided than bigger is the winner
        else if(sumDealerCards < sumPlayerCards){
            System.out.println("Congrats - You win!");
        }
        //even if dealer and player equal dealer wins
        else{
            System.out.println("Sorry - you lose");
        }
    }

    public void play(){

        //for loop to give each player two card
        for(int i = 0; i < 2; i++) {
            //gameDeck is an game class object and deal card is the top card
            playerHand[playerCards] = gameDeck.dealCard();
            playerCards++;

            //dealerHand is a list dealerCards is the index which will be added of card
            dealerHand[dealerCards] = gameDeck.dealCard();
            dealerCards++;
        }

        //show players hand
        System.out.println("Your Hand: ");
        printHand("Player");
        System.out.println();

        //hit or stay part
        Scanner input = new Scanner(System.in);
        System.out.print("(1)Hit or (2)Stay: ");
        int choice = input.nextInt();

        //initialize sum of player cards to zero
        int sumPlayerCards = 0;

        //while loop if it is a hit
        while(choice == 1){

            //draw new top card
            playerHand[playerCards] = gameDeck.dealCard();
            playerCards ++;

            //calculating sum of player cards again
            for(int i = 0; i < playerCards; i++){
                sumPlayerCards += playerHand[i].getValue();
            }

            //show players hand
            System.out.println("Your Hand: ");
            printHand("Player");
            System.out.println();

            //if sum is bigger than 21 loop is no longer needed
            if(sumPlayerCards > 21){
                choice = 2;
            }

            //if sum is equal to 21 loop is no longer needed
            else if(sumPlayerCards == 21){
                System.out.println("BlackJack!!");
                choice = 2;
            }

            //if player hits it relapse the loop
            else{
                System.out.print("(1)Hit or (2)Stay: ");
                choice = input.nextInt();
            }
        }

        //initialize the sum of dealer cards to zero
        int sumDealerCards = 0;

        //if it is bigger no need to calculation
        if(sumPlayerCards <= 21){

            //calculate the sum of dealer cards
            for(int i = 0; i < dealerCards; i++){
                sumDealerCards += dealerHand[i].getValue();
            }

            //dealer shall not draw cards after 17
            while(sumDealerCards < 17){
                dealerHand[dealerCards] = gameDeck.dealCard();
                sumDealerCards += dealerHand[dealerCards].getValue();
                dealerCards++;
            }
        }

        //showing dealer hand and print the results
        System.out.println();
        System.out.println("Dealer's Hand: ");
        printHand("Dealer");
        determineResult();
    }
}
