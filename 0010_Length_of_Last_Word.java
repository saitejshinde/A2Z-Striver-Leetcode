import java.util.Scanner;

class Length_of_Last_Word {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s; 
        s = sc.nextLine();
        System.out.println(s + "\n\n");
        int ans = lengthOfLastWord(s);
        System.out.println("\n"+ans+"\n");
    }


    static int lengthOfLastWord(String s) {

        int ans=0;
        String []ar = s.split(" ");
        String a = ar[ar.length-1];
        ans = a.length();
        return ans;
    }

}
