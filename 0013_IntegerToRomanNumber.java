class IntegerToRomanNumber {
 
    public static void main(String args[]){

        int a = 2888;

        String roman = intToRoman(a);
        System.out.println(roman);
        

    }

     public static String intToRoman(int num) {

       
        // medium optimize beats 24.5% 
        // String r = "";

        // while(num>0){
        //     if(num<0){
        //         break;
        //     }
            
        //     if(num / 1000 > 0  || num == 1000){
        //         num -= 1000;
                
        //         r += "M";
        //     }
        //     else if(num / 900 > 0  || num == 900){
        //         num -= 900;
        //         r += "CM";
        //     }            
            
        //     else if(num / 500 > 0  || num == 500){
        //         num -= 500;
        //         r += "D";
        //     }            


        //     else if(num / 400  > 0  || num == 400){
        //         num -= 400;
        //         r += "CD";
        //     }            


        //     else if(num / 100  > 0  || num == 100){
        //         num -= 100;
        //         r += "C";
        //     }            


        //     else if(num / 90 > 0  || num == 90){
        //         num -= 90;
        //         r += "XC";
        //     }            


        //     else if(num / 50 > 0  || num == 50){
        //         num -= 50;
        //         r += "L";
        //     }      
            
        //     else if(num / 40 > 0  || num == 40){
        //         num -= 40;
        //         r += "XL";
        //     }         
            
        //     else if(num / 10 > 0  || num == 10){
        //         num -= 10;
        //         r += "X";
        //     }       
            
        //     else if(num / 9  > 0  || num == 9){
        //         num -= 9;
        //         r += "IX";
        //     }         

            
        //     else if(num / 5 > 0  || num == 5){
        //         num -= 5;
        //         r += "V";
        //     }            

        //     else if(num / 4 > 0  || num == 4){
        //         num -= 4;
        //         r += "IV";
        //     }            
        //     // 2888
        //     else if(num / 1 > 0  || num == 1){
        //         num -= 1;
        //         r += "I";
        //     }




        // Most Optimize beats 98.63
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder r = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                r.append(symbols[i]);
            }
        }

        return r.toString();      


        //  beats 1.65% Lowest Optimize due to string is always created
        //  int n []    = {1000, 900,  500,  400, 100,  90,  50,   40,  10,   9,    5,   4,    1 };
        // String v [] = {"M" , "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; 
        // String s = String.valueOf(num);
        // String r = "";

        // for(int i = 0 ; i < n.length ; i++ ){

        //     while(num >= n[i] ){
                
        //         r += v[i];
        //         num -= n[i];
        //         System.out.print(num + "  ");

        //     }

        // }

        // return r;
        
    }

}
