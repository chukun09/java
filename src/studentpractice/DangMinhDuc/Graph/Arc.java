package studentpractice.DangMinhDuc.Graph;

public class Arc extends Bases{
	public Node begin;
	public Node end;
	public int w ; // trong so moi cung
	public Arc(int id) {
		super(id);
	}
	public  Arc (int id, Node begin, Node end){
		super(id);
		this.begin = begin;
		this.end = end;
	}
	public String toString() {
		return "(" + begin.getId() + "," + end.getId() + "," + w + ")";
	}
		
	}