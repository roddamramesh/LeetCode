class Solution {
    public List<Integer> partitionLabels(String S) {
        if(S.length() == 0 || S.length() == 1){
            return new ArrayList<>();
        }
        int[] arr= new int[26];
        List<Integer> lst = new ArrayList<Integer>();
        int start=0;
        int end=0;
        // Add max Index of each char
       for(int i=0;i<S.length();i++){
           arr[S.charAt(i)-'a']=i;
       }
        // check for each char max index when max index ==i then it matches criteria 
        for(int i=0;i<S.length();i++){
            end=Math.max(end,arr[S.charAt(i)-'a']);
            if(end==i){
                lst.add(end-start+1);
                start=end+1;
            }
        }
        
        return lst;
        
    }
}