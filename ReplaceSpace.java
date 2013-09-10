public class ReplaceSpace{
	public static String replaceSpace(String s){
		char[] c = s.toCharArray();
		if (s.isEmpty())
			return s;
		int l = c.length;
		int end;
		 for (end = l - 1; end >= 0; end--){
			 if (c[end] != ' ')
				break;		 
		}
		 return replaceHelper(c, end);
	}
	
	public static String replaceHelper(char[] c, int end){
		int spaceCount = 0;
		for (int i = end; i >= 0; i--){
			if(c[i] == ' ')
				spaceCount++;
		}
		
		int new_length = end+1+spaceCount*2;
		char[] new_char = new char[new_length];
		int j = 0;
		for (int i = 0; i <= end; i++){
			if(c[i] == ' '){
				new_char[j++] = '%';
				new_char[j++] = '2';
				new_char[j++] = '0';
			}
			else{
				new_char[j++] = c[i];
			}
		}
		
		return new String(new_char);
	}
	
	public static void main (String[] args){
		System.out.println(replaceSpace("Mr John Smith      "));
		System.out.println(Math.pow(2, 31));
	}
}