class Solution {
    public int trap(int[] height) {
        
        if (height.length < 3) return 0;
    
        int totalUnits=0;
        int s = 0;
        int e = height.length-1;
        // find the left and right edge which can hold water
        while(s < e && height[s] < height[s+1])
            s++;
        while(s < e && height[e] < height[e-1])
            e--;
        
        while(s < e){
            
            int left = height[s]; 
            int right = height[e];
            if(left < right){
                 // add volum until an edge larger than the left edge
                while(s < e && left >= height[++s])
                    totalUnits+= left - height[s];
            } else {
                // add volum until an edge larger than the right volum
                while(s<e && right >= height[--e]){
                    totalUnits+= right -height[e];
                }
                
            }
            
            
        }
        
        return totalUnits;
        
    
        
        
    }
}