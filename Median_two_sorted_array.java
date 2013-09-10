
public class Median_two_sorted_array {
	public static double findMedianSortedArrays(int A[], int B[]) {
        // Start typing your Java solution below
        // DO NOT write main() function
		int l1 = A.length;
		int l2 = B.length;
		if(l1 == 0)
			return B[l2/2];
		if(l2 == 0)
			return A[l1/2];
		if (A[l1-1] <= B[0]){
			int index = (l2+l1)/2 - l1;
			if(index >= 0)
				return B[index];
			else
				return A[l1+index];
		}
		
		if (B[l2-1] <= A[0]){
			int index = (l2+l1)/2 - l2;
			if(index >= 0)
				return A[index];
			else
				return B[l2+index];
		}
		
		int med1_index = l1/2;
		int med2_index = l2/2;
		int med1 = A[med1_index];
		int med2 = B[med2_index];
		while (med1 != med2 && med1_index > 1 && med2_index > 1){

			if (med1 < med2){
				med1_index += med1_index/2;
				med2_index -= med2_index/2;
			}
			if (med1 > med2){
				med1_index -= med1_index/2;
				med2_index += med2_index/2;
			}
			med1 = A[med1_index];
			med2 = B[med2_index];
		}
		
		return med2;
		
    }
	
	public static void main(String[] args){
		int[] i1 = {1, 2, 3, 5};
		int[] i2 = {4, 6, 7, 8, 9, 10};
		int[] i3 = {};
		int[] i4 = {1};
		System.out.println(findMedianSortedArrays(i2, i1));
		//System.out.println(3/2);
	}

}
