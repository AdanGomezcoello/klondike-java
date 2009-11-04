package kristofferversjon;

public class FoundationPile extends CardPile {
//foundation er der du bygger opp gjennom spillet
//looooooooooool
	
	public FoundationPile() {
		super();
	}
	
	public boolean canTake(Card card) {
		if(isEmpty()) {
			return card.getFace() == 0;
		}	
		else {
			Card top = peek();
			return (card.getSuit() == top.getSuit()) 
					&& (card.getFace() == (top.getFace()+1));
		}
	}
	
	public void addCard(Card card) {
		this.push(card);
		this.peek().setFaceUp();
	}
	
	//FIX
	public void addBuild(BuildPile pile) {
		
	}
	
	//FIX
	public boolean solved() {
		return false;
	}
	
}
