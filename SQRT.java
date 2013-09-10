public class SQRT{
	public static int sqrt(int x){
		if (x<=1)
			return x;
		
		int left = 0, right = x, mid;
		while(right-left > 1){
			mid = left + (right - left) /2;
			if(mid == x/mid)
				return mid;
			if(mid > x / mid)
				right = mid;
			if(mid < x /mid)
				left = mid;
		}
		return left;
	}
	
}