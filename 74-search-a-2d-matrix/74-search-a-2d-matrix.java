class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int rs = 0;
        int cs = 0;
        int ce = m[0].length-1;
        int re = m.length-1;
        
        while(rs <= re) {
            if(rs==re){
                System.out.println(rs);
                return search(m,rs,target);
            }
           int rmid= rs+(re-rs)/2;
            
            if(m[rmid][cs]==target){
                return true;
            } else if(target < m[rmid][cs]) {
                
                re = rmid;
            } else {
                if(target<=m[rmid][ce]){
                    re = rmid;
                } else {
                    rs = rmid+1;
                }
            
            }
        }
        return false;
    }
    
    boolean search(int[][] m, int rs, int target){
        int ce = m[0].length-1;
        int cs = 0;
        while(cs<=ce){
            int cmid = cs+(ce-cs)/2;
            if(m[rs][cmid] == target){
                return true;
            } else if(target < m[rs][cmid]){
                ce = cmid - 1;
            } else {
                cs = cmid + 1;
            }
        }
        return false;
    }
}