package studentpractice.HoangTuanHuy.Dictionary;

public class BST 
{
	private Node root;
	
	public  BST()
	{
		
	}
	private Node find(Node r, String enword)
	{
		 if(r==null) return null;
		 int c = r.getEnword().compareTo(enword);
		 if(c == 0) return r;
		 if(c==1) return find(r.getRight(),enword);
		 else return find(r.getLeft(),enword);
	}
	public String find(String enword)
	{
		Node p = find(root,enword);
		if(p==null) return null;
		return p.getVnmeaning();
	}
	public void set(String enword,String vnmeaning)
	{
		Node p = find(root,enword);
		if(p==null) return;
		p.setVnmeaning(vnmeaning);
	}
	private Node insert(Node r, String enword)
	{
		if(r==null) return new Node(enword);
		int c= r.getEnword().compareTo(enword);
		if(c<0) r.setRight(insert(r.getRight(),enword));
		else r.setLeft(insert(r.getLeft(),enword));
		return r;
		
	}
	public void insert(String enword)
	{
		root= insert(root,enword);
	}
}
