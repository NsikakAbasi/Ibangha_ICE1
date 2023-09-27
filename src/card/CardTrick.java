/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.*;
import java.lang.Math;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author NsikakAbasi Ibangha
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        int ranVal = random.nextInt(14);
        int ranSui = random.nextInt(4);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(ranVal);//random number generator
            c.setSuit(Card.SUITS[ranSui]);//Card.Suits
            magicHand[i] = c;

        }

        Scanner userin = new Scanner(System.in); //user input in the scanner 
        System.out.println("Hello user pick a card any card, input the suit and value;");

        String userSui = userin.nextLine(); // assigning a variable to the user input
        int userVal = userin.nextInt();

        Card userCard = new Card(); // creating a card for the user using their input
        userCard.setSuit(userSui);
        userCard.setValue(userVal);

        boolean compSuit = false; // condition of the comparison of users card and the cards in magic hand
        boolean compVal = false;

        int check = 0;
        // while ensures that each element in the array is checked
        // the loop contains if statements with conditions that compare the suit and number values of the user's card and of the current card in the array
        // once the condition is met the compSuit and compVal are made true
        do {
            if (userCard.getSuit().equals(magicHand[check].getSuit())) {
                compSuit = true;
            }

            if (userCard.getValue() == magicHand[check].getValue()) {
                compVal = true;
            }
            ++check;
        } while (check < 7);

        //final statement that makes the final check, if both 'comp' values are true than a message is sent accordingly 
        if (compSuit == true && compVal == true) {
            System.out.println("You have selected the right card");
        } else {
            System.out.println("You do not have the right card :=<");
        }
    }
}
