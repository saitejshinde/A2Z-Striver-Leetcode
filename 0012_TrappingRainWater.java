class TrappingRainWater{
    public static void main(String args[]){
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int capacity = trap (height);

        System.out.println("The Water Capacity is : "+capacity);
    }
    public static int trap(int[] height) {
 
        int capacity = 0 ;

        int l = height.length ;
        int lm []= new int[l];
        int rm [] = new int[l];

        lm[0] = height[0];
        rm[l-1] = height[l-1]; 

        for(int i = 1 ; i < l-1 ; i++ ){
            lm[i] = Math.max(lm[i-1] , height[i]);
        } 
        for(int i = l-2 ; i > 0 ; i-- ){
            rm[i] = Math.max(rm[i+1] , height[i]);
        }

        for(int i = 0 ; i < l-1 ; i++ ){
            int wl = Math.min(lm[i], rm[i]) - height[i];
            if(wl > 0 ){
                capacity += wl;
            }
        }
 
        return capacity ;
    }
}