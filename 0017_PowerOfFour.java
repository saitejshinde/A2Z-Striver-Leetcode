 class PowerOfFour {
     
    public static void main(String args[]){

        int a = 2888;

        boolean roman = isPowerOfFour(a);
        System.out.println(roman);
        

    }

    public static boolean isPowerOfFour(int n) {

        System.out.println(Math.pow(4, 11));
        int a = 1; 


        if( n!=0 && n==Math.pow(4, (int)(Math.log(n)/Math.log(4)))){
            return true;
        }
        else{
            return false;
        }
        // while(a<n){
        //     a*=4;
        // }

        // for(int i = 1 ; i <= n ; i = i *4){
        //     if(i == n){
        //         return true ;
        //     }
            

        // }
        // return a == n;
    }

    
}
