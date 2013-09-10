
public class StrStr {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
     int n_l = needle.length();
     int hay_l = haystack.length();
     
     if (n_l > hay_l) return null;
     if (needle == "") return haystack;
     int counter = 0;
     
     for(int i = 0; i< hay_l-n_l+1; i++){
         
         for(int j =0; j< n_l; j++){
             if(haystack.charAt(i+j) != needle.charAt(j)) break;
             counter++;
         }
         
         if(counter == n_l){
             return haystack.substring(i);
         }else{
             counter =0;
         }


     }
     
     return null;
     
    }

}
