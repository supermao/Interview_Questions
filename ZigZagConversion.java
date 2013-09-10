
public class ZigZagConversion {

	public static String convert(String s, int nRows) {
	    assert(s != null);
	    if (nRows == 1) return s;

	    StringBuffer buf = new StringBuffer();
	    int diff = nRows + nRows - 2;
	    for (int i = 0; i < nRows; i++) {
	        int index = i;
	        while (index < s.length()) {
	            buf.append(s.charAt(index));
	            index += diff;
	            if (i != 0 && i != nRows - 1 && index - i - i < s.length()) {
	                buf.append(s.charAt(index - i - i));
	            }
	        }
	    }

	    return buf.toString();
	}
	
	public static void main(String[] args){
		String s1 = "abcdefghijk";
		String s2 = convert(s1,5);
		System.out.println(s2);
		
	}

}
