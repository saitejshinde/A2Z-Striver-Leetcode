
import java.util.Scanner;

class StringToInteger_Atoi{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s; 
        s = sc.nextLine();

        int a = myAtoi(s);
        System.out.print(a);
    }

    public static int myAtoi(String s) {
        String numstring = "";
        s = s.trim();

        String sign="";
        if(s.startsWith("-") || s.startsWith("+")){
            sign = String.valueOf(s.charAt(0));
            s = s.substring(1);
        }
        int zcount=0;

        for(int i=0; i<s.length() ; i++){

            String c = String.valueOf(s.charAt(i));

            if(c.equals("0")  &&  zcount == 0 ){
                continue;
            }else if(c.matches("^[0-9]$")){
                zcount++;
                numstring += c;
            }else{
                break;
            }
        }
        

        

        if(numstring.equals("")){
            return 0; 
        }
        else{
            int result = 0 ; 
            numstring = sign+ numstring ;
            if(sign.equals("-")){
                try{
                     result = Integer.parseInt(numstring);
                     return result;
                }
                catch(Exception e){
                     result = -2147483648;
                    return result;
                }
            }
            else{
                try{
                    result = Integer.parseInt(numstring);
                    return result;
                }
                catch(Exception e){
                    result = 2147483647 ;
                    return result;
                }
            }
        }
    }
}