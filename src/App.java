import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
	Player player1 = new Player();
	Player player2 = new Player();
	Deck deck = new Deck();
	List<String> result = List.of("Player 1","Player 2","Draw","Play Again");
	int res = 3;
	
	player1.setName();
	player2.setName();
		while(player1.getName().equals(player2.getName())) {
			player2.setName(); }
		
	deck.loadDeck();
	deck.shuffle();
	
	for(int i=1;i<=52;i++) {
		if(i%2 != 0) { player1.draw(deck); }
		else { player2.draw(deck); } }
	
	//player1.describe(); player2.describe();
	
	for(int i=1;i<=26;i++) {
		String card1 = player1.flip();
		String card2 = player2.flip();
		if(value(card1) > value(card2)) {player1.incrementScore();}
		else if(value(card2) > value(card1)) {player2.incrementScore();} }
	
	if(player1.getScore() > player2.getScore()) { res = 0;}
		else if(player2.getScore() > player1.getScore()) { res = 1;}
		else if(player1.getScore() == player2.getScore()) { res = 2;}
			
	System.out.println(player1.getName() + ": " + player1.getScore() +" vs " + player2.getName() + ": " + player2.getScore());
	System.out.println("Winner = " + result.get(res));
	
	}
	//End of main
	public static int value(String test) {
		char temp=test.charAt(0);
		int num = Character.getNumericValue(temp);
		if(num == 1) {
			temp=test.charAt(1);
			num = Character.getNumericValue(temp);
			if(num==0) {num=10;}
			else if(num==1) {num=11;}
			else if(num==2) {num=12;}
			else if(num==3) {num=13;}
			else if(num==4) {num=14;} }
		return num;	}
	
}