
import java.util.Scanner;

 class ValidPalindrome {

    public static void main (String args[]){
          
        Scanner sc = new Scanner( System.in);
      
      
        while(true){
            System.out.print(" Enter the String to Validate the palindrome : ");
            String a="";
            a = sc.nextLine();
            if(a.equals("0")){
                    
                break;
            
            }
            boolean r = isPalindrome(a);
            System.out.println("\n\n"+r);
          
        }
    }
     public static boolean isPalindrome(String s) {
        String a = s.replaceAll("[^A-Za-z0-9]", "");
        System.out.print(a);

        a = a.toLowerCase();
        if(a.isEmpty()) return true;

        for(int i = 0 ; i<= (a.length()/2) ; i++){
            if(a.charAt(i) != a.charAt(a.length()-i-1)){
                return false ;
            }
        }
        return true;
    }
    
}
