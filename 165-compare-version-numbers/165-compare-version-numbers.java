class Solution {
    public int compareVersion(String version1, String version2) {
        // Split the string into String array
        String[] v1Arr= version1.split("\\.");
        String[] v2Arr= version2.split("\\.");

        int maxLength=Math.max(v1Arr.length,v2Arr.length);
        
        for(int i=0;i<maxLength;i++){
            int v1=i<v1Arr.length?Integer.parseInt(v1Arr[i]):0;
            int v2=i<v2Arr.length?Integer.parseInt(v2Arr[i]):0;
            int compare = v1<v2?-1:v1>v2?1:0;
            if(compare!=0)
                return compare;
        }
       
        return 0;
    }
}