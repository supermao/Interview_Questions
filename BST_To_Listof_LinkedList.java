import java.util.ArrayList;
import java.util.LinkedList;


public class BST_To_Listof_LinkedList {
	
	public ArrayList<LinkedList<BST>>convert(BST root){
		ArrayList<LinkedList<BST>> lists = new ArrayList<LinkedList<BST>>();
		convert_helper(root, lists, 0);
		return lists;

	}
	
	public void convert_helper(BST root, ArrayList<LinkedList<BST>> lists, int level){
		
		LinkedList<BST> list = new LinkedList<BST>();
		if(lists.size() == level){
			lists.add(list);
		}else{
			list = lists.get(level);
		}
		
		list.add(root);
		convert_helper(root.left, lists, level+1);
		convert_helper(root.right, lists, level+1);
		
	}
	
	
	
	public ArrayList<LinkedList<BST>>convert2(BST root){
		ArrayList<LinkedList<BST>> result = new ArrayList<LinkedList<BST>>();
		LinkedList<BST> current = new LinkedList<BST>();
		
		if(root != null){
		current.add(root);
		}
		while(current.size() > 0){
			result.add(current);
			LinkedList<BST> parents = current;
			current = new LinkedList<BST>();
			for (BST parent : parents){
				if(parent.left != null){
					current.add(parent.left);
				}
				if(parent.right != null){
					current.add(parent.right);
				}
			}
			
		}
		
		return result;
		
		
	}

}