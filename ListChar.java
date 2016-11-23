package cs2s03;


//ListChar implements a linked list of characters using the MyStack interface

public class ListChar implements MyStack{
	private char hd;
	private ListChar tl;
		
	//Constructors
	public ListChar(char c, ListChar l){this.hd = c; this.tl = l;}
	
	public ListChar() {this.hd = 0; this.tl = null;}
	
	
	//Return the top of the the stack (no modification)
	public char top() throws EmptyContainerException { 
		if (this.hd == 0) throw new EmptyContainerException("Empty stack");
		return this.hd; 
	}
	
	//Remove the top of the stack
	public void pop() {
		if (this.hd == 0) return;
		if (this.tl == null) this.hd = 0;
		else {
			this.hd = this.tl.hd;
			this.tl = this.tl.tl;
		}
	}
	
	//Add an element 
	public void push(char c) {
		this.tl = new ListChar(this.hd, this.tl);
		this.hd = c;
	}
	
	public boolean isEmpty() {
		return this.hd == 0;
	}
	
	//Visual representation of the data structure. Will be used for testing
	public String toString() {
		if (this.tl == null) return String.valueOf(this.hd);
		return this.hd + "\n" + this.tl.toString();
	}
	
	//Tests equality of two ListChar's by using toString
	public boolean equals(ListChar lst) {
		if (this.toString() == lst.toString()) return true;
		return false;
	}
}