---
title: Deck Of Cards
categories: [ 'sample-code', 'java', 'arrays' ]
---

Working with Arrays as a deck of cards

````java

/*   
 * Name: DeckOfCards
 * CSU ID: 
 * CIS 265: Review
 * Description: Working with multiple arrays (a deck of cards)
 *
*/
import java.util.Scanner;

public class DeckOfCards {
    /**
     * Main entrty point for the program
     */
    public static void main(String[] args){

        //
        // Initialization
        int[] deck = new int[52];
        String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
        String[] ranks = { "Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };    

        // Init the deck
        for(int i =0; i < deck.length; i++){
            deck[i] = i;
        }

        // Shuffle the deck
        for(int i =0; i < deck.length; i++){

            int hold = deck[i];
            int index = (int)(Math.random() * deck.length);

            // using that random location, set our current card to that value,
            // and the hold (our current value) to the random location
            deck[i] = deck[index];
            deck[index] = hold;
        }

        //
        // Print some cards
        System.out.println("First 5 cards: ");
        System.out.println();
        for(int i =0; i < 5; i++){

            // Suits are divided into 4 sets of 13
            String suit = suits[ deck[i] / 13 ];

            // ranks are 
            String rank = ranks[ deck[i] % 13 ];

            // output the cards
            System.out.printf("%4s:%s ", rank, suit );
        }
        System.out.println();

        System.out.println("------------------------------");
        System.out.println("Dealing Cards... ");

        //
        // Deal cards
        int[] player1 = new int[5];
        int[] player2 = new int[5];
        int players = 2;
        int index = 0;
        
        //
        // Deal to each of the players
        for(int i = 0; i < 5; i++ ){
                        
            player1[i] = deck[index++];
            player2[i] = deck[index++];                    
        }

        System.out.println("Deck position: " + index);

        //
        System.out.println("------------------------------");
        System.out.println("Hands: ");
        System.out.print("P1: ");
        for(int i = 0; i < 5; i++){

            // output the cards
            System.out.printf("%6s:%s", getRank(player1[i], ranks), getSuit(player1[i], suits) );
        }
        System.out.println();

        System.out.print("P1: ");
        for(int i = 0; i < 5; i++){

            // output the cards
            System.out.printf("%6s:%s", getRank(player2[i], ranks), getSuit(player2[i], suits) );
        }
        System.out.println();
                    
        System.out.println(":: end-of-program ::");        
    }    
    /**
     * Gets a suit from the index
     */
    public static String getSuit( int index, String[] suits ){
        // Suits 
        String suit = suits[ index / 13 ];
        return suit;
    }
    /**
     * Gets the rank for the index
     */
    public static String getRank(int index, String[] ranks){
        // Ranks are divided into 13 values
        String rank = ranks[ index % 13 ];
        return rank;
    }    
}

````
