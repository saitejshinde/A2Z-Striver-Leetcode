import java.util.*;


class LongestSubstringWithoutRepeatingCharacters{

    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);

        String s ;
        s = sc.nextLine();

        // s="abba";

        int a = lengthOfLongestSubstring(s);

        System.out.print(a);

    }

    public static int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> a = new HashMap<>();

        int maxLen=0, left=0;
        int r=0;
        for(int i=0 ; i<s.length(); i++){

            char c = s.charAt(i);

            
            if (a.containsKey(c) && a.get(c) >= left) {
                left = a.get(c) + 1; 
            }

            a.put(c, i); 
            maxLen = Math.max(maxLen, i - left + 1);
        }


        
        return   maxLen;

    }
}

// java LongestSubstringWithoutRepeatingCharacters < input.txt > output.txt