import java.util.ArrayList;;


public class Merge_interval {
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Interval> answer = new ArrayList<Interval>();

		int n = intervals.size();
		if (n == 0) return null;
		Interval current = intervals.get(0);
		if (n == 1) return intervals;
		for(int i = 1; i < n; i++){

			Interval it = intervals.get(i);

			if(current.end >= it.start){
				current.end = it.end;
			}else{
				answer.add(current);
				current = it;
			}

			if(i == n-1){
				answer.add(current);
			}
		}

		return answer;

	}
	
	public static void main(String[] args){
		
		Interval i1 = new Interval(1,3);
		ArrayList<Interval> ii1 = new ArrayList<Interval>();
		ii1.add(i1);
		ArrayList<Interval> i2 = merge(ii1); 
		System.out.println(i2);
	}


}
