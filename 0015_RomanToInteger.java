import java.util.Scanner;

class RomanToInteger{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in); 

        String s = sc.nextLine();
        
        int a = romanToInt(s);

        System.out.println(a);

    }
    public static int romanToInt(String s) {
        int[] v =    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] y = {"M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int result = 0;
        int i = 0;
        
        while (s.length() > 0 && i < y.length) {
            if (s.startsWith(y[i])) {
                result += v[i];
                s = s.substring(y[i].length());
            } else {
                i++;
            }
        }
        
        return result;
    }
}