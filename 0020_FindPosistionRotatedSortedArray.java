
import java.util.Scanner;

class FindPositionRotatedSortedArray{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int[]a = {4,5,6,7,0,1,2,3};
        System.out.println(search(a, 0));

    }
    static int search(int[] nums, int target) {
      
        int len = nums.length;
        int l=0; 
        int r=len-1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[l]<= nums[mid]){
                if(nums[l]<= target && target< nums[mid]){
                    r= mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[r]){
                    l = mid+1;
                }
                else{
                    r=mid-1;
                }
            }

            // else if (nums[mid] > target ){
            //     r = mid-1;
            // }
            // else{
            //     l = mid+1;
            // }
        }
        return -1;
        
    }
}