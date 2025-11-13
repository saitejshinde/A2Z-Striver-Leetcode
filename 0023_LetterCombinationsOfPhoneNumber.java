
import java.util.*;

 class LetterCombinationsOfPhoneNumber {

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = "1";
        while(a.equals("1")){

            System.out.println("Want to continue");
            a = sc.nextLine();
            System.out.println("Enter Number ");
            String b = sc.nextLine();
            ArrayList<String> c = new ArrayList<>(letterCombinations(b));
            for(int i = 0 ; i<c.size();i++){
                System.out.println(c.get(i));
            }
        }
    }

     public static List<String> letterCombinations(String digits) {
        ArrayList<String> re = new ArrayList<>() ;
        re.add("");
        Map<String, String> map =  new HashMap<>();
        map.put("2","abc" );
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        int l = digits.length();

        String f = map.get(String.valueOf(digits.charAt(0)));

        System.out.println(f);
        

        for( int i =0 ; i<l;i++){
            String g = map.get(String.valueOf(digits.charAt(i)));

            ArrayList<String> tlist = new ArrayList<>();

            // re.add(String.valueOf(f.charAt(i)));
            
            for(String b : re){
                for(int j = 0 ; j < g.length() ; j++){
                    tlist.add(b+ String.valueOf(g.charAt(j)));
                }
            }

            re = tlist;
        }

        return re;
    }
    
}
