package Interview;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

/*
 * "ABC"->["def","xyz"]
 * 
 * Print dfs format.
 */

public class TuneIn_TreePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String parents[]={"abc","def","klm","zzz"};
		String childs[][]={{"def","xyz"},{"klm","zzz"},{"ooo"},{"yyy"}};
		Hashtable<String, ArrayList<String>> mapping=new Hashtable<String, ArrayList<String>>();
		
		for(int i=0;i<parents.length;i++){
			ArrayList<String> child=new ArrayList<>();
			String childrens[]=childs[i];
			for(int j=0;j<childrens.length;j++)
				child.add(childrens[j]);
			mapping.put(parents[i], child);
			
		}
		System.out.println(mapping);
		travesal("abc", mapping);
	}

	public static void travesal(String root,
			Hashtable<String, ArrayList<String>> mapping) {

		
		Stack<Elem> stack = new Stack<Elem>();
		int x = 1;
		Elem newNode = new Elem(root, x);
		stack.push(newNode);

		while (!stack.isEmpty()) {
			Elem u = stack.pop();
			
			String s = u.getString();
			int childCount = u.getCount();
			printNode(s, childCount);
			
		
			if(null!=mapping.get(s)){
				for (int i = 0; i < mapping.get(s).size(); i++) {
				String child = mapping.get(s).get(i);
				Elem childNode=new Elem(child,childCount+1);

				stack.push(childNode);
				child=null;
				childNode=null;
				}
			}
		}

	}

	public static void printNode(String s, int count) {
		String res = "";
		for (int i = 0; i < count; i++)
			res += "-";

		System.out.println(res + " " + s);

	}

	static class Elem {
		String s;
		int count;

		public Elem(String root, int x) {
			this.s = root;
			this.count = x;

		}

		public String getString() {
			return s;
		}

		public int getCount() {

			return count;
		}
		

	}

}
