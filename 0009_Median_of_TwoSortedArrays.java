class Median_of_TwoSortedArrays {
    public static void main(String args[]){
        int [] a = {1,2};
        int [] b = {3,4};

        double ans = findMedianSortedArrays(a, b);
        System.out.println(ans);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int [] a = new int[nums1.length + nums2.length ];
        int l = a.length ;
        int n1 = 0 , n2 = 0; 


        for(int i = 0; i<l ; i++){

             if(n1 >= nums1.length && n2 < nums2.length){
                a[i] = nums2[n2];
                n2++;
            }
            else if (n2 >= nums2.length  && n1 < nums1.length ){
                a[i] = nums1[n1];
                n1++;
            }

            if((n1 <  nums1.length) && (n2 < nums2.length)){
                if(nums1[n1] < nums2[n2]){
                    a[i] = nums1[n1];
                    n1++;
                }
                else if(nums1[n1] > nums2[n2]){
                    a[i] = nums2[n2];
                    n2++;
                }
                else if(nums1[n1] == nums2[n2]){
                    a[i] = nums1[n1] ;
                    i++;
                    a[i] = nums2[n2];
                    n1++;
                    n2++; 
                }
            }
           
        }

        if(a.length % 2 == 0){
            int e ;    
            e = a.length / 2;
            double sum = a[e] + a[e-1];
            System.out.println(a[e] + "    e-1 = " + a[e-1] +" -- "+ sum/2);
            result = (double) sum / 2;
        }
        else{
            int e = a.length/2;
            result = a[e];
        }


        return result;

    }
}
