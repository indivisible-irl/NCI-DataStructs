package ca01_CardGame;

public class PlayGame {
	public static void main(String[] args){
		
		// count turns
		int counter = 0;
		// some players
		Player p1 = new Player("Jack");
		Player p2 = new Player("Jill");
		
		// new deck
		CardDeck deck = new CardDeck();
		//deck.dispValues();
		
		// take some turns
		run(p1, p2, deck, counter);
	}
	
	public static void intro(){
		// print introduction
	}
	public static void run(Player p1, Player p2, CardDeck deck, int count){
		while (true){
			turn(p1, p2, deck, ++count);
		}
	}
	public static void turn(Player p1, Player p2, CardDeck deck, int count){
		Player winningPlayer = winner(p1, p2);
		if (winningPlayer != null){
			// game over
			System.out.println("\n==========================================");
			System.out.println("============= !! WINNER !! ===============");
			System.out.println("Congratulations to " +winningPlayer.getName()+ " for winning");
			System.out.println("==========================================");
			System.exit(0);
		}
		System.out.println("================== Turn " +String.format("%02d", count)+ " ==================");
		System.out.println("Playing:");
		System.out.println("\t" +p1.getName()+ ":\t" + p1.getPoints());
		System.out.println("\t" +p2.getName()+ ":\t" + p2.getPoints());
		System.out.println("--------------------------------------------");
		
		deck.populate();
		deck.Shuffle();
		p1.acceptHand(deck.Deal());
		p2.acceptHand(deck.Deal());
		dispHand(p1, deck);
		dispHand(p2, deck);
		
		calcWinner(p1, p2, deck);
		System.out.println("==========================================");
	}
	private static void dispHand(Player p, CardDeck deck){
		System.out.print(p.getName()+ " was dealt:\n    [ ");
		for (ICard c : p.getHand()){
			System.out.print(c.toString());
		}
		System.out.println("]\t:  "+deck.evaluateHand(p.getHand())+ " points.");
	}
	private static void calcWinner(Player p1, Player p2, CardDeck deck){
		int score = deck.evaluate(p1.getHand(), p2.getHand());
		//System.out.println("!!! Score is: " +score);
		System.out.println("--------------------------------------------");
		if (score > 0){
			// player 1 wins
			p1.addPoints(score);
			System.out.println("Congratulations to " +p1.getName()+ ". They get " +score+ " points.");
		} else if (score < 0){
			// player 2 wins (change to (+)ve int)
			p2.addPoints(score * -1);
			System.out.println("Congratulations to " +p2.getName()+ ". They get " +(score*-1)+ " points.");
		} else if (score == 0){
			// players draw
			System.out.println("A draw! Let's go again.");
		} else {
			System.out.println("Unknown outcome. Score: " +score);
		}
	}
	private static Player winner(Player p1, Player p2){
		final int WINNING_SCORE = 250;
		if (p1.getPoints() > WINNING_SCORE){
			// player 1 wins game
			return p1;
		} else if (p2.getPoints() > WINNING_SCORE){
			// player 2 wins game
			return p2;
		} else {
			// no winner yet
			return null;
		}
	}
}
