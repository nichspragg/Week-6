import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	static List<String> cards = new ArrayList<>();
	Random rand = new Random();
	Card card = new Card();
	
	// getters and setters below //
	protected void loadDeck() {
		cards = card.getCards();	
		}

	protected void shuffle() {
		List<String> shufDeck = new ArrayList<>();
		while(this.cards.size()>0) {
			int i = rand.nextInt(this.cards.size());
			String temp = cards.get(i);
			shufDeck.add(cards.get(i));
			cards.remove(i);
			}
		cards = shufDeck;
		}

	protected static String draw() {
		String removedCard = cards.get(0);
		cards.remove(0);
		return removedCard;
		}

}