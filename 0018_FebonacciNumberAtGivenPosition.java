
import java.util.Scanner;

 class FebonacciNumberAtGivenPosition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while(a==1){

            System.out.println("Want to continue");
            a = sc.nextInt();
            System.out.println("Enter the Number ");

            int b = sc.nextInt();

            System.out.println(fib(b));

        }
    }
    public static int fib(int n) {
        int prev =1;
        int curr =1;
        int num =0;
        if(n == 0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }

        for(int i = 3; i<= n ; i++ ){
            int temp = curr;
            num = curr+ prev;
            curr = num;
            prev= temp;

        }
        return num;

        
    }
}
