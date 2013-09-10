public class CompressString{
	public static String compress(String s){
		String result = "";
		int counter = 0;
		char last = s.charAt(0);
		for (int i = 1; i < s.length(); i++){
			char now = s.charAt(i);
			if (last == now)
				counter++;
			else{
				if(i != 0){
					result = result + Integer.toString(counter+1) + now;
					counter = 0;
				}
				else{
					result += now;
				}
			}
			last = now;
		}
		result += Integer.toString(counter+1);
		return result;

	}
	
	public static void main(String[] args){
		String test = "aabcccccaaa";
		System.out.println(compress(test));
	}
}