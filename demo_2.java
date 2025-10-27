import java.util.Scanner;

class demo_2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        boolean b = isPalindrome(a);

        System.out.print(b);
    }

     public static boolean isPalindrome(int x) {
        
        if (x < 0) return false;

        int original = x;
        long reversed = 0; 

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}