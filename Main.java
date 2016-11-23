package cs2s03;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws EmptyContainerException {

		
		ListChar LC = new ListChar('a', new ListChar('b', new ListChar('c', null)));
		
		StackChar SC = new StackChar();
		SC.push('c'); SC.push('a'); SC.push('d');
		
		
		SnocQueue SQ = new SnocQueue();
		
		System.out.println(SC.toString());
		
		
		
	}
}
