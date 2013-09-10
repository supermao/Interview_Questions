import java.util.ArrayList;
import java.util.HashMap;

public class Phone_Number {
	public static ArrayList<String> letterCombinations(String digits) {
		// Start typing your Java solution below
		// DO NOT write main() function

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");

		ArrayList<String> answer = new ArrayList<String>();
		if (digits == "" || digits == null){
			return answer;
		}
		
		int total = 1;
		int l = digits.length();
		int[] branch_after = new int[l];
		for(int i=l-1; i>=0; i--){
			branch_after[i] = total;
			total *= map.get(digits.charAt(i) - '0').length();
		}
		
		
		for(int j=0; j<total; j++){
			StringBuffer s = new StringBuffer();
			for (int k=0;k<l;k++){
				String current = map.get(digits.charAt(k)-'0');
				int cureent_char_index = j/(branch_after[k])%current.length();
//				System.out.println(current);
//				System.out.println(cureent_char_index);
				s.append(current.charAt(cureent_char_index));
			}
			String ss = s.toString();
			answer.add(ss);
		}
//		System.out.println(total);
		
		
		return answer;
		
	}
	
	
	
	public static void main(String[] args){
		String number = "2";
		ArrayList<String> al = letterCombinations(number);
		System.out.println(al);
	}
	
	
}