
import java.util.Scanner;

class AddBinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Str 1: ");
        String a ;
        a=sc.nextLine();
        System.out.println();
        System.out.print("Enter the Str 2: ");
        String b ;
        b=sc.nextLine();

        String result = addBinary(a, b);
        
        System.out.println();

        System.out.println("Result : "+ result);


    }


     public static  String addBinary(String a, String b) {
        String carry="0";
        int ldiff = a.length()- b.length();

        String result ="";

        String sstr = "";
        sstr = ldiff > 0 ? b : a ;
        String bstr = sstr.equals(a) ? b : a;

        if(ldiff!=0){
            if( ldiff < 0 ){
                ldiff = -1 * ldiff;
            }
            for(int i =0; i< ldiff ; i++){
                sstr = "0" + sstr;
            }
        }
        else{
            sstr = a;
        }
        ldiff = sstr.length()- bstr.length();
        System.out.print(sstr+"  "+ ldiff);

        for(int i = sstr.length()-1 ; i >=0 ; i-- ){

            char s = sstr.charAt(i);
            char bc =  bstr.charAt(i);
            if( (s == '1' && bc=='1' && carry.equals("0")) ||
                  (s=='0' && bc=='1' && carry.equals("1") ) || 
                        (s=='1' && bc=='0' && carry.equals("1")) ){
                carry="1";
                result =  "0" + result;
            }
            else if((s == '1' && bc=='1' && carry.equals("1")) ||
                        (s=='0' && bc=='0' && carry.equals("1") ) || 
                        (s=='0' && bc=='1' && carry.equals("0")) ||
                        (s=='1' && bc=='0' && carry.equals("0"))){
                if(s == '1' && bc=='1' && carry.equals("1")){
                    carry="1";
                    result = "1" + result;
                }else{
                    carry="0";
                    result = "1" + result;
                }
            }else if(s=='0' && bc=='0' && carry.equals("0")){
                result = "0" + result;
            }
            
        }
        if(carry.equals("1") ){
            result = carry+ result;
            carry="0";
        }

        return result ;

    }
}
