
import java.util.Scanner;



class AmstrongNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while(a==1){

            System.out.println("Want to continue");
            a = sc.nextInt();
            System.out.println("Enter the Number ");

            int b = sc.nextInt();

            System.out.println(isAmstrongNumber(b));

        }
    }

    public static boolean isAmstrongNumber(int a){

        int l = String.valueOf(a).length();
        int sum = 0;
        int num = a;
        while(a!=0){
            int c = a%10;
            sum += (int)Math.pow(c,l);
            a/=10;
        }
        return num==sum;
    }
}