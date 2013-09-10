import java.util.ArrayList;
import java.util.Stack;


public class Valid_Parentheses {
	public static boolean isValid(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int l = s.length();
		if(l%2 !=0){
			return false;
		}
		Stack<Character> stack = new Stack<Character>();

		for(int i = 0; i<l; i++){
			char c = s.charAt(i);

			if(c == '('){
				stack.push(')');
				continue;
			}

			if(c == '{'){
				stack.push('}');
				continue;
			}

			if(c == '['){
				stack.push(']');
				continue;
			}

			if (stack.empty()){
				return false;
			}

			if(stack.pop() == c){
				continue;
			}else{
				return false;
			}
		}

		return stack.empty();

	}

	public static void main(String[] args){
		String input = "()[]{}";
		boolean output = isValid(input);
		System.out.println(output);
	}
}
