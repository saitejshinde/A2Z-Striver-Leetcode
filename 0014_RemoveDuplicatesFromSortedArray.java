class RemoveDuplicatesFromSortedArray{
    public static void main(String args[]){
        int [] a = {1,2,2,3,3,4,5,6,7,7,8,8,8,8,8,9};

        int k = removeDuplicates(a);
        System.out.println(k);
        
    }

     static  int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                System.out.println(nums[k]);
                k++;
            }
        }

        

        return k;
    }
}