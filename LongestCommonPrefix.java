
public class LongestCommonPrefix {
	public  static String  longestCommonPrefix(String[] strs) {
		// Start typing your Java solution below
		int l = strs.length;
		if (l == 0){
			return "";
		}

		int j = strs[0].length();
		for(int i = 0; i < j; i ++){
			for(int m = 0; m < l-1; m++){
				if(i == strs[m+1].length() || strs[m].charAt(i) != strs[m+1].charAt(i)){
					System.out.println("i = "+ i);
					return strs[0].substring(0,i);
				}
			}
		}
		return strs[0];
	}

	public static void main(String[] args){
		String[] s_array = {
				"c","c"
		};
		String s = longestCommonPrefix(s_array);
		System.out.println("answer =" + s);
	}



}
