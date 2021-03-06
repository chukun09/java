package studentpractice.phamthivan.Graph;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Graph {
	public ArrayList<Node> V;
	public HashMap<Node,ArrayList<Arc>> A;  
	HashMap<Integer, Node> mId2Node = new HashMap<Integer, Node>();
	
	public Node getNodebyid(int id){
		return mId2Node.get(id);
	}
	public ArrayList<Arc> getAdjacent(Node u){
		return A.get(u);
	}	
	public void loadData(String filename){
		try{
			Scanner inp = new Scanner(new File(filename));
			int n = inp.nextInt();
			 int m = inp.nextInt();
			V = new ArrayList<Node>();
			A = new HashMap<Node,ArrayList<Arc>>();
			
			
			for(int i = 1; i <= n; i++){
				Node nod = new Node(i);
				V.add(nod);
				mId2Node.put(i,nod );
				A.put(nod, new ArrayList<Arc>());
				
			}
			for(int k  = 1; k <= m; k ++){
				int u = inp.nextInt();
				int v = inp.nextInt();
				int w = inp.nextInt();
				
				Node nu = mId2Node.get(u);
				Node nv = mId2Node.get(v);
				Arc a = new Arc(k,nu,nv);
				a.w  = w;
				A.get(nu).add(a);
				
			}
			inp.close();
		}catch(Exception ex){
			ex.printStackTrace();
			
		}
	}
	public void print(){
		System.out.print("V= ");
		for(Node u: V){
			System.out.print(u.getId()+ " ");
		}
		System.out.println();
		for(Node u: V){
			ArrayList<Arc> Au = A.get(u);
			System.out.print("A["+ u.getId() + "] =");
			for(Arc a: Au){
				System.out.print(a.toString());
			}
			System.out.println();
		}
		
	}
	public static void main(String[]args){
		Graph G = new Graph();
		G.loadData("src/studentpractice/phamthivan/Graph/graph.txt");
		G.print();
	}
	
}
