package cs2s03;

import java.util.ArrayList;

public class StackChar implements MyStack {
	private ArrayList<Character> hd;
	
	public StackChar(){this.hd = new ArrayList<Character>();}
	
	
	
	public char top() throws EmptyContainerException {
		if (hd.isEmpty()) throw new EmptyContainerException("Empty Stack");
		return hd.get(0);
	}
	
	public void pop() {
		if (hd.isEmpty()) return;
		this.hd.remove(0);
	}
	
	public void push(char c) {this.hd.add(0, c);}
	
	
	public boolean isEmpty() {
		if (this.hd == null) return true;
		return false;
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < this.hd.size(); i++) {
			if(i == this.hd.size() - 1) output += hd.get(i);
			else output += hd.get(i) + "\n";
		}
		return output;
	}
	
	public boolean equals(StackChar lst) {
		if(this.hd.toString() == lst.toString()) return true;
		return false;
	}
}
