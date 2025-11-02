class Divide2Nummbers {

    public static void main(String args[]){
        int a =10, b=9;
        int an= divide(a,b);

        System.out.println(an);
    }
    static int divide(int dividend, int divisor) {
      
        if (divisor == 0) {
            return 0;
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        double ans = (double) dividend / divisor;

        int result = (int) ans;

        return result;
        
    }
    
}
