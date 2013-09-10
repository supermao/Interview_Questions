import java.util.HashMap;



public class Two_sum {

	public static int[] two_sum(int[] numbers, int target){
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		int[] answer = new int[2];
		for (int i = 0; i < numbers.length; i++){
			int current = numbers[i];
			if(map.containsKey(current)){
				answer[0] = map.get(current) + 1;
				answer[1] = i + 1;
			}
			else
				map.put(target - numbers[i], i);
		}
		return answer;
	}

	public static void main(String[] args){
		String s = "hello";
		int [] i = new int[2];
		System.out.println(i[1]);
	}
}



