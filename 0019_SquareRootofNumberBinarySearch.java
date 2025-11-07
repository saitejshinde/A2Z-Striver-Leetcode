
import java.util.Scanner;

 class SquareRootofNumberBinarySearch {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while(a==1){

            System.out.println("Want to continue");
            a = sc.nextInt();
            System.out.println("Enter Number ");
            int b = sc.nextInt();
            System.out.println(mySqrt(b));
        }
    }

    public static int mySqrt(int x) {


        // int a = 0; 
        // while(a * a < x){
        //     if((a+1)*(a+1)>x){
        //         break;
        //     }
        //     a++;
        // }

        if(x==0 || x==1){
            return x;
        }
        int ans =0;
        int l=1 , r= x/2; 
        while(l<=r){
            int mid = l+ (r-l)/2;

            if((long)mid * mid == x){
                ans= mid;
                break;
            }
            else if((long)mid * mid < x){
                ans = mid;
                l=mid+1;
            }
            else{
                r = mid-1;
            }

        }
        return ans;
        // return (int)Math.round(Math.exp(0.5*Math.log(x))) ;
    }
}
