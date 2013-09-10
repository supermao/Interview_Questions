public class IsNumberPalindrome {
	public static boolean isPalindrome(int x) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int i = x;
		int r = 0;
		if(x < 0){
			return false;
		}
		while(i != 0){
			if(r > Integer.MAX_VALUE/10 || (r == Integer.MAX_VALUE/10 && i%10 > Integer.MAX_VALUE%10)){
				return false;
			}
			r = r*10 + i%10;
			i/= 10;
		}
		return r == x;

	}

	public static void main(String[] args){
		int i1 = -2147447412;
		System.out.println(isPalindrome(i1));
	}
}
