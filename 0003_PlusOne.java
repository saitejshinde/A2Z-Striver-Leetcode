import java.util.Arrays;

class PlusOne{
    public static void main(String args[]){
        int a []= {9,9};
        
        int b[] = solution(a);

        System.out.print("{ ");

        for(int i = 0; i<b.length; i++){
            System.out.print(b[i]+", ");
        }
        System.out.print(" }");

    }

    public static int[] solution(int [] a){


        for(int i = a.length-1; i>=0 ; i--){
            
            if(a[i]<9){
                a[i]++;
                return a;
            }
            a[i]=0;
        }

        int arr[]= Arrays.copyOf(a, a.length+1);
        arr[0]=1;
        

        return arr;
    }
}