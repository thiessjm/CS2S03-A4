package cs2s03;

public class SnocList {
	private SnocList tl;
	private char hd;
	
	//Constructors
	public SnocList(char c, SnocList l) {this.tl = l; this.hd = c; }
	
	
	public SnocList(){this.hd = 0; this.tl = null;}
	
	//defining getters and setters
	public char getHd() {return this.hd;}
	public SnocList getTl() {return this.tl;}
	public void setTl(SnocList l) {this.tl = l;}
	
	
	public void pop() {
		if (!this.isEmpty()) {
			this.hd = this.tl.hd;
			this.tl = this.tl.tl;
		}
		
	}
	
	public boolean isEmpty() {
		if (this.hd == 0 && this.tl == null) return true;
		return false;
	}
}
