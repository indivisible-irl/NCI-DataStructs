package ca01_CardGame;

import java.util.ArrayList;

public interface ICardDeck<E> {

	E take();
	void add(E e);
	void Shuffle();
	ArrayList<ICard> Deal();
	int size();
	boolean isEmpty();
	int evaluate(ArrayList<ICard> h1, ArrayList<ICard> h2);
	
}
