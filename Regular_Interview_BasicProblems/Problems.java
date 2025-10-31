
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problems {

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

         // 1️⃣ Max of three numbers
        System.out.println("Max of 10, 20, 15: " + maxOfThreeNumbers(10, 20, 15));

        // 2️⃣ Prime check
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Is 20 prime? " + isPrime(20));

        // 3️⃣ Fibonacci series up to 50
        System.out.println("\nFibonacci series up to 50:");
        febonacciSeries(50);

        // 4️⃣ Palindrome check
        System.out.println("\nIs 'level' a palindrome? " + isPalindrome("level"));
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello"));

        // 5️⃣ GCD of two numbers
        System.out.println("\nGCD of 36 and 60: " + gcdOfTwoNumbers(36, 60));

        // 6️⃣ Number of vowels in a string
        System.out.println("\nNumber of vowels in 'Education': " + numberOfVowelsInString("Education"));

        sc.close();
        
    }

    static int maxOfThreeNumbers(int a , int b , int c){
        int max1 = Math.max(a, b);
        int max = Math.max(max1, c); 
        return max ;
    }

    static boolean  isPrime (int a ){
        boolean valid = true;

        for(int i = 2 ; i <= a/2 ; i++){
            if(a%i==0){
                valid = false;
                break;
            }
        }
        return valid;
    }

    static ArrayList<Integer> febonacciSeries(int a ){
        ArrayList<Integer> ans = new ArrayList<>();

        int prev = 0; int curr = 1;

        System.out.println(0 +"\n"+ 1);

        ans.add(0);
        ans.add(1);

        while(curr <= a){
            int temp = curr;
            curr += prev;
            System.out.println(curr);
            ans.add(curr);
            prev = temp;

        }
        return ans;

    }

    static Boolean isPalindrome(String s ){
        int l = s.length();
        boolean valid = true;

        for(int i = 0 ; i <= l/2 ; i++){
            if(s.charAt(i) != s.charAt(l-i-1)){
                valid = false;
                break;
            }
        }

        return valid;
    }

    static int gcdOfTwoNumbers(int a , int b){
        
        int min = Math.min(a, b);
        int gcd = 1;
        
        for(int i = 1 ; i <= min/2 ; i++ ){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }

        return gcd;
        
    }

    static int numberOfVowelsInString(String s ){

        int l = s.length();
        s = s.toLowerCase();
        int count=0;

        Set<Character> a = new HashSet<>();
        a.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for(int i = 0; i < l ; i++ ){
            if(a.contains(s.charAt(i))){
                count++;
            }
        }

        return count;

    }
    
}
