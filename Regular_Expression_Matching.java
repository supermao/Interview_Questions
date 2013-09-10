
public class Regular_Expression_Matching {

    public  static boolean isMatch(String s, String p) {
		if(s == null) return p == null;
		return m(s, p, 0, 0);
	}
	public static  boolean m(String s, String p, int i, int j){
		if(j == p.length()) {
			return i == s.length();   
		}
		if(j == p.length() - 1 || p.charAt(j + 1) != '*'){
			if(i == s.length()) {
				return false;   
			}
			return (p.charAt(j) == '.' || s.charAt(i) == p.charAt(j)) && m(s, p, i+1, j+1);
		}                               
		while(i < s.length() && (p.charAt(j) == '.' || s.charAt(i) == p.charAt(j))){  
			if (m(s, p, i++, j + 2)) {
				return true;
			}
		}
		return m(s, p, i, j + 2);   
	}

	public static void main(String[] args){
		String s1 = "aa";
		String s2 = "aa";
		System.out.println("finally " + isMatch(s1,s2));
	}

}
