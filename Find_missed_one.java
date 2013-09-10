
public class Find_missed_one {
	
	public static int find_missed_one(int[] input){
		int left = 0;
		int right = input.length;
		int mid = (left + right)/2;
		
		// 10 -> 5
		// 9 -> 5
		// 1 2 3 4 5 7 8 9 10
		
		while(right - left > 2){
		int mid_int = input[mid - 1];
		if (mid_int == mid){
			left = mid_int;	
		}
		else{
			right = mid_int;
		}
		mid = left + (right - left)/2;
	}
		return mid;
		}
	
	public static void main(String[] args){
		int[] i1 = {1,2,3,4,5,7,8,9,10};
		int[] i4 = {1,2,3,4,5,7,8,9,10,11};
		int[] i2 = {1,2,4,5,6,7,8,9};
		int[] i3 = {2,3,4,5,6,7,8,9,10};
		
		System.out.println(find_missed_one(i1));
		System.out.println(find_missed_one(i2));
		System.out.println(find_missed_one(i3));
		System.out.println(find_missed_one(i4));
	}
	

}
