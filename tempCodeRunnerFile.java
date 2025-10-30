 int n []    = {1000, 900,  500,  400, 100,  90,  50,   40,  10,   9,    5,   4,    1 };
        String v [] = {"M" , "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; 
        String s = String.valueOf(num);
        String r = "";

        for(int i = 0 ; i < n.length ; i++ ){

            while(num >= n[i] ){
                
                r += v[i];
                num -= n[i];
                System.out.print(num + "  ");

            }

        }

        return r;