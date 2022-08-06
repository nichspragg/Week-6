import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
	private int score = 0;
	private Random rand = new Random();
	private List<String> names = List.of("Nich","Lise","Will","Finn","Jonah","Clare");
	private String name;
	private List<String> hand = new ArrayList<>();
	
	// getters and setters below //
	protected String setName() {
		int i = rand.nextInt(names.size());
		name = names.get(i);
		return name;
		}
	protected String getName() {
		return name;
		}
	
	protected void draw(Deck deck) {
		hand.add(Deck.draw());
		}
	
	protected void describe() {
		System.out.println(name + ": ");
		for(String crd:hand) { Card.describe(crd); }
		}
	
	protected String flip() {
		String removedCard = hand.get(0);
		hand.remove(0);
		return removedCard;
		}
	
	protected void incrementScore() {
		score ++;
		}
	
	protected int getScore() {
		return score;
		}
}
