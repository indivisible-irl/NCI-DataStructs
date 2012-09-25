/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca01_CardGameSolution;

import java.util.*;
/**
 *
 * @author Mark
 */
public class CardDeck implements ICardDeck<ICard> {

    private ArrayList<ICard> _deck = new ArrayList<ICard>();
    private int _dealCount = 5;

    public CardDeck() {
        addSuitedCards('H', 4);
        addSuitedCards('C', 1);
        addSuitedCards('D', 3);
        addSuitedCards('S', 2);
    }
    
    private void addSuitedCards(char suit, int suitValue)
    {
        for(int c = 2; c <=14; c++)
        {
            switch (c)
            {
                case 10:
                    _deck.add(new Card(suit, suitValue, "10", c));
                    break;
                    
                case 11:
                    _deck.add(new Card(suit, suitValue, "J", c));
                    break;
                    
                case 12:
                    _deck.add(new Card(suit, suitValue, "Q", c));
                    break;

                case 13:
                    _deck.add(new Card(suit, suitValue, "K", c));
                    break;

                case 14:
                    _deck.add(new Card(suit, suitValue, "A", c));
                    break;

                default:
                    _deck.add(new Card(suit, suitValue, String.valueOf(c), c));
                    break;
            }
            
        }
    }
    
    @Override
    public ICard take() {
        return _deck.remove(0);
    }

    @Override
    public void add(ICard e) {
        _deck.add(e);
    }

    @Override
    public void Shuffle() {
        for(int i = 0; i< 5; i++)
        {
            Collections.shuffle(_deck);
        }
    }

    @Override
    public ArrayList<ICard> Deal() {
        ArrayList<ICard> hand = new ArrayList<>();
        
        for(int i = 0; i <= _dealCount; i++)
        {
            hand.add(this.take());
        }
        
        return hand;
    }

    @Override
    public int size() {
        return _deck.size();
    }

    @Override
    public boolean isEmpty() {
        return _deck.isEmpty();
    }
    
    @Override
    public int evaluate(ArrayList<ICard> h1, ArrayList<ICard> h2)
    {
        int h1Total = calculateHandTotal(h1);
        int h2Total = calculateHandTotal(h2);
        
        
        if(h1Total == h2Total)
        {
            return 0; // Draw
        }
        else if(h1Total > h2Total)
        {
            return 1; // h1 wins
        }
        else
        {
            return -1; // h1 looses
        }
    }
    
    private int calculateHandTotal(ArrayList<ICard> h)
    {
        int total = 0;
        
        // Get the sun of hand1
        for (int i = 0; i < h.size(); i++) {
            ICard currentCard = h.get(i);
            
            total += (currentCard.suitValue() * currentCard.numericValue());
        }
        
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        Iterator iter = _deck.iterator();
        while(iter.hasNext())
        {
            sb.append((ICard)iter.next()).append("\n");
        }
        
        return sb.toString();
    }
    
    
    
}
