public class Rotate_image{
	public static void rotate(int[][] image){
		int len = image.length;
		for (int layer = 0; layer < len/2; layer++){
			int first = layer;
			int last = len - layer - 1;
			for (int j = first; j < last; j++){

				int offset = j - first;
				
				int top = image[first][j];

				image[first][j] = image[last-offset][first];

				image[last-offset][first] = image[last][last-offset];

				image[last][last-offset] = image[j][last];
				
				image[j][last] = top;
			}
			
		}
	}
	
	public static void main(String[] args){

		 int[][] test = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		 
		 rotate(test);
            for(int i=0;i<4;i++)
             {
             for(int j=0;j<4;j++)
                {
                  System.out.println(test[i][j]);
                }
              }
        
	}
}