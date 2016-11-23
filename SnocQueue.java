package cs2s03;

public class SnocQueue implements MyQueue {
	private SnocList sl;
	
	public SnocQueue(){this.sl = new SnocList();}
	
	//returns front of queue
	public char peek() throws EmptyContainerException {
		if(this.sl.isEmpty()) throw new EmptyContainerException("SnocQueue");
		
		else { return this.sl.getHd(); }
	}
	
	//Remove element from front of queue
	public void dequeue() {
		this.sl.pop();
	}
	
	public void enqueue(char c) {
		if (this.sl.isEmpty()) {
			this.sl.setTl(new SnocList(c, null));
		} else {
		
		}
	}
	public boolean isEmpty() {
		
	}
}
