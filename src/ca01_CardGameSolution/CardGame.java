/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca01_CardGameSolution;

/**
 *
 * @author Mark
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CardDeck cards = new CardDeck();
        // Shuffle the cards
        cards.Shuffle();
       
        Player p1 = new Player("Mark");
        Player p2 = new Player("Peter");
       
        p1.acceptHand(cards.Deal());
        p2.acceptHand(cards.Deal());
        
        
        int result = cards.evaluate(p1.getHand(), p2.getHand());
        
        if(result == 0)
        {
            System.out.println("Draw");
        }
        else if(result == 1)
        {
            System.out.println("P1 Wins");
        }
        else
        {
            System.out.println("P2 Wins");
        }
            
        System.out.println("::::::::::::Player 1's Hand :::::::::::::");
        p1.showHand();
        
        System.out.println("::::::::::::Player 2's Hand :::::::::::::");
        p2.showHand();
        
    }
}
