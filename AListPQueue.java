package cs2s03;

public class AListPQueue implements MyPriorityQueue {
	private AList lst;
	
	AListPQueue() {
		lst = new AList();
	}
	
	public char next() throws EmptyContainerException {
		if (this.lst.isEmpty()) throw new EmptyContainerException("empty queue");
		return this.lst.getHd();
	}
	
	public void deleteItem() {
		if (this.lst.isEmpty()) return;
		this.lst = this.lst.getTl();
	}
	
	public void insertItem(int p, char c) {
	 if (p > this.lst.getPri()) this.lst = new AList(c, p, this.lst);
	 
	 if (p < this.lst.getPri()) this.lst = 
	}
}
