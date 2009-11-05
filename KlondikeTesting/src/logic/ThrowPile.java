package logic;
//throwpile er der de kortene du trekker ender
public class ThrowPile extends CardPile {
	
	public ThrowPile() {
		super();
	}
	
	public void addCard(CardPile source) {
		Card c = source.pop();
		c.setFaceUp();
		this.push(c);
		System.out.println("Kort " + this.peek() + " flyttet fra DrawPile til ThrowPile");
		
	}
	
	public void drawCard(CardPile target){
		target.push(this.pop());
		System.out.println("Kort " + target.peek() + " flyttet fra ThrowPile til target");
	}
//	testing
//	public static void main(String[] args) {	
//		DrawPile dp = new DrawPile();
//		ThrowPile tp = new ThrowPile();
//		TableauPile tap = new TableauPile();
//		tp.addCard(dp);
//		System.out.println("TableauPile: " + tap + " ThrowPile: " + tp + " DrawPile: " + dp);
//		tp.drawCard(tap);
//		System.out.println("TableauPile: " + tap + " ThrowPile: " + tp + " DrawPile: " + dp);
//		
//	}
}