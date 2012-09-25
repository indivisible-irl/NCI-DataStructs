package ca01_CardGame;

import java.util.ArrayList;
import java.util.Iterator;

public class Player {

	//// data
	
	private String name;
	private int points;
	private ArrayList<ICard> hand;
	
	//// constructor
	
	public Player(String n) {
		name = n;
		points = 0;
	}
	
	//// get & set
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void addPoints(int pts){
		points += pts;
	}
	public int getPoints(){
		return points;
	}
	public void acceptHand(ArrayList<ICard> cards) {
		hand = cards;
	}
	public ArrayList<ICard> getHand() {
		return hand;
	}
	
	//// functional methods
	
	public void showHand() {
		for (Iterator<ICard> it = hand.iterator(); it.hasNext();) {
			ICard iCard = it.next();
			System.out.println(iCard.toString());
		}
	}
}
