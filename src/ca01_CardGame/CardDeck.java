package ca01_CardGame;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck implements ICardDeck<ICard> {

	//// data
	
	private ArrayList<ICard> deck;
	private static final char[] SUITS = {'h', 'd', 's', 'c'};
	// char will not allow '10' therefore 1-9 used as 2-10 instead. Will +1 as needed for display and numeric values.
	private static final char[] VALUES = {'a', 'k', 'q', 'j', '9', '8', '7', '6', '5', '4', '3', '2', '1'};

	//// constructor
	
	public CardDeck(){
		deck = new ArrayList<ICard>();
		this.populate();
	}
	
	//// get & set
	
	public ArrayList<ICard> getDeck(){
		return deck;
	}
	public void setDeck(ArrayList<ICard> cards){
		deck = cards;
	}
	
	//// Implementation / Overrides
	
	@Override
	public ICard take() {
		// chose to deal from the bottom of the deck as less calculation, more robust and computers don't peek
		if (isEmpty())
			return null;
		return deck.remove(0);
	}
	@Override
	public void add(ICard c) {
		// add individual cards to the deck
		deck.add(c);
	}
	@Override
	public void Shuffle() {
		// shuffle 4 times
		for (int i=0; i<4; i++)
			Collections.shuffle(deck);
	}
	@Override
	public ArrayList<ICard> Deal() {
		// deal one hand's worth of cards
		if (isEmpty())
			return null;
		ArrayList<ICard> hand = new ArrayList<ICard>();
		for (int i=0; i<5; i++)
			hand.add(take());
		return hand;
	}
	@Override
	public int size() {
		// return deck's size
		return deck.size();
	}	
	@Override
	public boolean isEmpty() {
		// test whether deck has elements
		return deck.isEmpty();
	}
	@Override
	public int evaluate(ArrayList<ICard> h1, ArrayList<ICard> h2) {
		int handTotalP1 = evaluateHand(h1);
		int handTotalP2 = evaluateHand(h2);
		// if (+)ve P1 wins, if (-)ve P2 wins
		return handTotalP1 - handTotalP2;
	}
	
	//// my methods
	
	public int evaluateHand(ArrayList<ICard> h){
		int total = 0;
		for (ICard c : h){
			total += c.numericValue();
		}
		return total;
	}
	public void populate(){
		for (char suit : SUITS){
			// iterate over suits
			for (char value : VALUES){
				// iterate over values
				deck.add(new Card(suit, value));				
			}
		}
	}
	public void disp(){
		System.out.println("================== Deck ==================");
		for (ICard card : deck){
			System.out.println(card.toString());
		}
		System.out.println("==========================================");
	}
	
//	public void dispValues(){
//		for (ICard c : deck){
//			System.out.println(c.toString() +":"+ ((Card) c).numericValue());
//		}
//	}
	
}
