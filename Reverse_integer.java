public class Reverse_integer{
	public static int reverse_integer(int input){
		int answer = 0;
		
		while(input != 0){
			answer = answer *10 + input % 10;
			input /= 10;
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		
		System.out.println(reverse_integer(123));
	}
	
}