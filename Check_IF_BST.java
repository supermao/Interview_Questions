
public class Check_IF_BST {

	public boolean check_bst(BST root){

		return check_helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean check_helper(BST root, int min, int max){
		
		if(root == null){
			return true;
		}
		
		if(root.val >= max || root. val < min){
			return false;
		}

		if(!check_helper(root.left, min, root.val)) return false;
		if(!check_helper(root.right, root.val, max)) return false;

		return true;


	}
	
	

}