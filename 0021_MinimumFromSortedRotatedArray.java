
import java.util.Scanner;

 class MinimumFromSortedRotatedArray {

    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        int []a = { 7,8,9,10,1,2,3,4 };
        System.out.println(findMin(a));


    }

    public static int findMin(int[] nums) {
        
        int l=0 , r=nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;

            if(nums[l]<= nums[mid]){
                ans = Math.min(ans, nums[l]);
                l=mid+1;
            }
            else{
                r=mid-1;
                ans = Math.min(ans, nums[mid]);
            }
        }

        return ans;
    }
    
}
