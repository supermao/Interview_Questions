
public class Atoi {

	public static int atoi(String str) {
		// Start typing your Java solution below
		// DO NOT write main() function
		boolean neg = false;
		boolean plus = false;
		boolean started = false;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int answer = 0;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(c == ' '){
				if(started){
					break;
				}
			}
			else if(c == '-'){
				started = true;
				if(neg){
					return 0;
				}
				neg = true;
			}

			else if(c == '+'){
				started = true;
				if(plus){
					return 0;
				}
				plus = true;
			}
			else if(c >= '0' && c <= '9'){
				started = true;
				int offset = c - 48;
				if(!neg){
					if(answer > max/10 || (answer == max/10 && offset > max%10)){
						return max;
					}
				}else{
					if(answer*(-1) < min/10 || (answer*(-1) == min/10 && offset < min%10)){
						return min;
					}
				}
				answer = answer*10 + offset;
			}else{
				if (started){
					break;
				}else{
					return 0;   
				}
			}
		}
		answer = neg? answer*(-1) : answer;
		answer = answer < 0 &&(!neg)? max : answer;
		answer = answer > 0 &&(neg)? min : answer;

		return answer;
	}
	
    public static int atoi2(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if(str == null){
        return 0;
        }
        
        int l = str.length();
        boolean white_space = true;
        boolean plus_flag = false;
        boolean minus_flag = false;
        int max_value = Integer.MAX_VALUE;
        int min_value = Integer.MIN_VALUE;
        int answer = 0;


        for(int i =0; i < l; i++){
            char c = str.charAt(i);
        	if(c == ' ' && white_space){
        		continue;
        	}
        	white_space = false;
        	if(c == ' '){
        	return 0;
        	}

        	if(c == '+' && plus_flag == false){
        	plus_flag = true;
        	continue;
        	}

        	if(c == '-' && minus_flag == false){
        	minus_flag = true;
        	continue;
        	}

        	int current = c - '0';

        	if(current < 0 || current > 9){
        	return 0;
        	}
        	
        	if(answer > max_value /10 || (answer == max_value/10 && current > max_value %10)){
        		 return minus_flag? min_value : max_value;
        	}

        	answer = answer * 10 + current;
        	}

        	return minus_flag? (-1) * answer: answer;

        }
    

	public static void main(String[] args){
		String s1 = "    -10522545459";
		int i1 = atoi2(s1); 
		System.out.println(i1);
		//    	System.out.println(Integer.MIN_VALUE);
	}
}
