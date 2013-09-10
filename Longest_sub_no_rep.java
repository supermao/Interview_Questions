import java.util.HashMap;


public class Longest_sub_no_rep {
	public static int lengthOfLongestSubstring(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String s1 = "";
		String s2 = "";
		char[] c = s.toCharArray();
		int all_index = 0;
		for(int i = 0; i < c.length; i++){
			String sub = String.valueOf(c[i]);
			if(!map.containsKey(sub)){
				s2 += sub;
				map.put(sub, i-all_index);
			}
			else{
				if (s2.length() > s1.length()){
					s1 = s2;
				}
				int rep_index = map.get(sub);
				s2 = s2.substring(rep_index+1);
				s2 += sub;
				all_index++;
				all_index += rep_index;
				map = new HashMap<String, Integer>();
				char[] c2 = s2.toCharArray();
				for(int j = 0; j < c2.length; j++){
					String sub2 = String.valueOf(c2[j]);
					map.put(sub2, j);
				}
			}
		}
		return Math.max(s1.length(), s2.length());
	}
	
	public static void main(String[] args){
		String s1 = "abcabcde";
		System.out.println(lengthOfLongestSubstring(s1));
	}
}