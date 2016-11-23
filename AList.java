package cs2s03;
public class AList {
	private char hd;
	private int priority;
	private AList tl;
	
	AList(final char a, final int b, final AList ll) {
		this.hd = a; this.priority = b; this.tl = ll; 
	}
	
	AList() {
		this.hd = 0; this.priority = 0; this.tl = null;
	}
	
	public String toString() {
		if (this.tl == null) {
			return String.valueOf(this.hd) + String.valueOf(this.tl) ;
		}
		else return this.hd + this.priority + this.tl.toString();
	}
	
	public boolean equals(AList lst) {
		return this.toString() == lst.toString();
	}
	
	
	public boolean isEmpty() {
		return (this.hd == 0 && this.tl == null);
	}
	
	//Compares a priority p with the priority of a given item in the queue
	public boolean comparePri(int p, AList item) {
		return (p == item.getPri());
	}
	
	//Defining getters and setters
	public char getHd() {
		return this.hd;
	}
	
	public int getPri() {
		return this.priority;
	}
	
	public AList getTl() {
		return this.tl;
	}
	
	public void setHd(char newHd) {
		this.hd = newHd;
	}
	
	public void setPri(int pri) {
		this.priority = pri;
	}
	
	public void setTl(AList al) {
		this.tl = al;
	}
	
}
