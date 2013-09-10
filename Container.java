
public class Container {
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int start = 0;
    	int end = height.length - 1;
    	int max_area = 0;
    	while(start != end){
    		int h = Math.min(height[start], height[end]);
    		int a = h*(end-start);
    		if(a > max_area){
    			max_area = a;
    		}
    		if(height[start] < height[end]){
    			start++;
    		}else{
    			end--;
    		}
    	}
    	
    	return max_area;
        
    }
    
    

}
