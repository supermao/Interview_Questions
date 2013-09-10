import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class ThreeSum {

	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function


		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

		if(num.length < 3) return al;

		Arrays.sort(num);

		int n = num.length;

		for(int i=0; i < n -2 && num[i] <= 0; i++){
			if(i > 0 && num[i] == num[i-1]) continue;
			int a = num[i];
			int k = i+1;
			int l = n - 1;

			while(k < l){
				int b = num[k];
				int c = num[l];

				if(a + b + c == 0){
					ArrayList<Integer> current = new ArrayList<Integer>();
					current.add(a);
					current.add(b);
					current.add(c);
					al.add(current);
					l = l -1;
					k = k + 1;
					while(k < l && num[l] == num[l+1]){
						l--;
					}
					while(k< l && num[k] == num[k-1]){
						k++;
					}
				}else if(a + b +  c > 0){
					l = l -1;
				}else{
					k = k + 1;
				}

			}
		}
		return al;
	}

	public static ArrayList<ArrayList<Integer>> threeSum2(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function

        int n = num.length;
    	ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
		if (n < 3){
			return answer;
		}
        Arrays.sort(num);
		for (int i = 0; i < n -2; i++){
			if(i > 0 && num[i] == num[i-1])continue;

			int a = num[i];
			int start = i+1;
			int end = n-1;

			while(start < end){
				int b = num[start];
				int c = num[end];
				if(a+b+c == 0){
					ArrayList<Integer> map = new ArrayList<Integer>();
					map.add(a);
					map.add(b);
					map.add(c);
					answer.add(map);
					start++;
					end--;
					while(start < end && num[start] == num[start - 1]){
						start++;
					}
					while(start < end && num[end] == num[end + 1]){
						end--;
					}
				}else if(a + b + c > 0){
					end--;
				}else{
					start++;
				}
			}

		}

		return answer;
	}


	public static void main(String[] args){
		int[] input1 = {-1,0,1};
		int[] input2 = {0,0,0};
		int[] input3 = {7,5,-8,-6,-13,7,10,1,1,-4,-14,0,-1,-10,1,-13,-4,6,-11,8,-6,0,0,-5,0,11,-9,8,2,-6,4,-14,6,4,-5,0,-12,12,-13,5,-6,10,-10,0,7,-2,-5,-12,12,-9,12,-9,6,-11,1,14,8,-1,7,-13,8,-11,-11,0,0,-1,-15,3,-11,9,-7,-10,4,-2,5,-4,12,7,-8,9,14,-11,7,5,-15,-15,-4,0,0,-11,3,-15,-15,7,0,0,13,-7,-12,9,9,-3,14,-1,2,5,2,-9,-3,1,7,-12,-3,-1,1,-2,0,12,5,7,8,-7,7,8,7,-15};

		ArrayList<ArrayList<Integer>> output = threeSum2(input2);
		System.out.println(output);

	}

}
