import java.util.*;

class LongestPrefix {

    public static void main (String [] args ){
        String[] s = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(s));
    }

    static String longestCommonPrefix(String[] strs) {

        String result ="";
        Arrays.sort(strs, (a,b)-> a.length() - b.length());
        String f1 = strs[0];
        
        for(int i=0; i<f1.length() ; i++){
            String a = String.valueOf(f1.charAt(i));
            boolean valid = false;

            for(int j=0; j< strs.length; j++){
                if(strs[j].startsWith(a)){
                    valid = true;
                    
                    strs[j] = strs[j].substring(1);
                }
                else{
                    valid = false;
                    break;
                }
            }

            if(!valid){
                break;
            }
            else{
                result+=a;
            }

        }
        
        return result;
    }
}
