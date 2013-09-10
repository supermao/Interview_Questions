
public class Sorted_array_to_bst {
	
	public BST convert(int[] input){
		return convert_helper(input, 0, input.length -1);
	}
	
	public BST convert_helper(int[] input, int start, int end){
		if(end > start){
			return null;
		}
		
		int mid = (start + end)/2;
		BST root = new BST(mid);
		root.left = convert_helper(input, start, mid - 1);
		root.right = convert_helper(input, mid + 1, end);
		
		return root;
	}

}
