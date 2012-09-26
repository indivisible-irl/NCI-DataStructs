/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca01_CardGameMarc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mark
 */
public class Player {
    
    private String _name;
    private ArrayList<ICard> _hand;

    public Player(String n) {
        _name = n;
    }
    
    public String getName()
    {
    	return _name;
    }
    public void acceptHand(ArrayList<ICard> hand)
    {
        _hand = hand;
    }
    
    public ArrayList<ICard> getHand()
    {
        return _hand;
    }
    
    public void showHand()
    {
        for (Iterator<ICard> it = _hand.iterator(); it.hasNext();) {
            ICard iCard = it.next();
            
            System.out.println(iCard.toString());
        }
    }
}
