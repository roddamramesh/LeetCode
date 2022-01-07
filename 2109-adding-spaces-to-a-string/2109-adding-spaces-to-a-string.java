class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder sb= new StringBuilder();
        int prevPos=0;
        for(int pos:spaces){
            sb=sb.append(s.substring(prevPos,pos));
            sb.append(" ");
            prevPos=pos;
        }
        sb.append(s.substring(prevPos,s.length()));
        return sb.toString();
    }
}