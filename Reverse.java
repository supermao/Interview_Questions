public class Reverse{
	public static void reverse(String s){
		char[] array = s.toCharArray();
		char temp;
		int l = array.length;
		for (int i =0; i< l/2 +1; i++){
			int endIndex = l-i-1;
			temp = array[i];
			array[i] = array[endIndex];
			array[endIndex] = temp;
		}
		s = new String(array);
		System.out.println(s);
		
	}
	
	public static void main(String[] args){
		String myString = "Hello";
		reverse(myString);
		System.out.println(myString);
	}
}