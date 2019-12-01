package studentpractice.tranvanthang.dictionary;

public class Dictionary {
	private BST[] bst;
	public Dictionary(int sr){
		bst=new BST[sr];
		for(int i=0;i<sr;i++){
			bst[i]=new BST();
		}
	}
	private int h(String key){
		return Math.abs(key.hashCode())%bst.length;
	}
	public void insert(String enWord){
		int idx=h(enWord);
		bst[idx].insert(enWord);
	}
	public String find(String enWord){
		int idx=h(enWord);
		return bst[idx].find(enWord);
	}
	public void set (String enWord,String vnMeaning){
		int idx=h(enWord);
		bst[idx].set(enWord, vnMeaning);
	}
	
}
