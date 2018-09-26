package game;

public class ChocholateJar implements Jar {
	
	private int chocolate;
	private int chilli;
	
	public ChocholateJar() {
		chocolate = 13 ;
		chilli = 1;
	}
	public ChocholateJar(int chocolate) {
		this.chocolate=chocolate;
		chilli = 1;
	}
	public int getItem() {
		return chocolate+chilli;
	}
	public int getChochlate() {
		return chocolate;
		
	}
	public int getChilli() {
		return chilli;
		
	}
	public void takeItem(int hand) {
		if (hand > chocolate) {
			chilli = 0; chocolate=0;
		} else {
			chocolate = chocolate-hand;
		}
		
	}
	public String status() {
		String chil="", cho="";
		for(int i=0; i<chilli; i++) {
			chil += "бс ";
		}
		for(int i=0; i<chocolate; i++) {
			cho += "бр ";
		}
		return "[ "+chil+cho+"]";
	}
	public boolean isEmpty() {
		if (chocolate==0 && chilli==0)
			return true;
		else
			return false;
		}
}