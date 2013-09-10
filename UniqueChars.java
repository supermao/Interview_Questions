public class UniqueChars{
	public static boolean uniqueChar(String s){
		if (s.length()>256)
			return false;
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < s.length(); i++){
			char my_char = s.charAt(i);
			if(char_set[my_char])
				return false;
			else char_set[my_char] = true;
		}
		return true;
	}
	
	public static void main(String[] args){	
		String myString = "bcdba";
		System.out.println(uniqueChar(myString));
		
		
	}
	
}