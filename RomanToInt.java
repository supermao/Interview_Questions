import java.util.HashMap;
import java.util.Map;


public class RomanToInt {

    public int romanToInt(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		HashMap<Character,Integer> m = new HashMap<Character, Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);

		int l = s.length();
		int last_digit = 0;
		int answer = 0;
		if(l >= 1){


			for(int i = l-1; i >=0;i--){
				answer += m.get(s.charAt(i)) >= last_digit? m.get(s.charAt(i)) : -m.get(s.charAt(i));
				last_digit = m.get(s.charAt(i));
			}

		}
		return answer;
    }
}
