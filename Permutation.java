public class Permutation{
	public static boolean permutation(String s1, String s2){
		if (s1.length() != s2.length()){
			return false;
		}
		else{
			
			int[] flags = new int[256];
			for(int i = 0; i < s1.length(); i++){
				flags[s1.charAt(i)]++;
			}
			for(int i =0; i < s2.length(); i++){
				if(flags[s2.charAt(i)] - 1 < 0)
					return false;
			}
			return true;
		}
	}
	
	public static void main(String[] args){
		System.out.println(permutation("qwertyuiopasdfghjklzxcvbnm", "abcdefgeigklmnopqrstuvwxyz"));
	}
}