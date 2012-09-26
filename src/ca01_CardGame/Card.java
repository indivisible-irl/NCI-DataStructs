package ca01_CardGame;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Card implements ICard {

	//// data
	
	private char suit;
	private char value;
	// compile at class root and make final to same re-compiling and multiple instances
	//    unnecessary but nice addition (overkill? go simple instead?)
	private final Pattern p = Pattern.compile("[akqj]");
	
	//// constructor
	
	public Card(char s, char v){
		suit = s;
		value = v;
	}
	
	//// implementations / overrides
	
	@Override
	public char suit() {
		return suit;
	}

	@Override
	public int suitValue() {
		// good addition. know switch works for char type
		switch (suit){
		case 'h':
			return 4;
		case 'd':
			return 3;
		case 's':
			return 2;
		case 'c':
			return 1;
		default:
			return 0;
		}
	}

	@Override
	public String displayValue() {
		// test to see if a 'royal' card
		Matcher m = p.matcher(String.valueOf(value));
		if (m.find()){
			return String.valueOf(value).toUpperCase();
		}
		// +1 as values are stored as char which will not allow '10'. 1-9 used as 2-10 instead.
		return String.valueOf(faceValue());
	}

	@Override
	public int numericValue() {
		return suitValue() * faceValue();
	}
	
	public int faceValue() {
		switch (value){
		case 'a':
			return 14;
		case 'k':
			return 13;
		case 'q':
			return 12;
		case 'j':
			return 11;
		default:
			// +1 as values are stored as char which will not allow '10'. 1-9 used as 2-10 instead.
			return charIntToNumValue(value);
		}
	}
	
	@Override
	public String toString(){
		return suitToString() + displayValue() + ", "; 
	}
	
	private String suitToString(){
		return String.valueOf(suit).toUpperCase();
	}

	private int charIntToNumValue(char c){
		//TODO must be a better way to do this but don't have the time to look
		//    actually not that bad, but his 4 field card is perhaps saving computation later on
		return Integer.valueOf(String.valueOf(c))+1;
	}
}
