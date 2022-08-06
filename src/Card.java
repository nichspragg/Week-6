import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Card {

	private int value[] = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	private List<String> name = List.of(" of Hearts"," of Spades"," of Clubs"," of Diamonds");
	
	// getters and setters below //
	protected List<String> getCards() {
		List<String> cards = new ArrayList<>();
		for(int num:value) { 
			for(int i=0;i<name.size();i++) {
				cards.add(num + name.get(i));
			} }
		return cards;
		}
	
	protected static void describe(String str) {
		StringBuilder sb = new StringBuilder(str);
		String nomen[]= {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		char temp=sb.charAt(0);
		int num = Character.getNumericValue(temp);
		sb.deleteCharAt(0);
		if(num == 1) {
			temp=sb.charAt(0);
			num = Character.getNumericValue(temp);
			if(num==0) {num=10; sb.deleteCharAt(0);}
			else if(num==1) {num=11; sb.deleteCharAt(0);}
			else if(num==2) {num=12; sb.deleteCharAt(0);}
			else if(num==3) {num=13; sb.deleteCharAt(0);}
			else if(num==4) {num=14; sb.deleteCharAt(0);}
			}
		num = num-2;
		sb.insert(0,nomen[num]);
		System.out.println(sb);
		}
	
}