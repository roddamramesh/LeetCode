class Solution {
    public char nextGreatestLetter(char[] letters, char key) {
      int start=0;
      int end= letters.length-1;
      if(key>=letters[end]|| key<letters[start]){
        return letters[0];
      }
//General binary Search. returning start since i have to find the ceiling of matching letter or next letter of matched letter
      while(start<=end){
        int mid = start +(end-start)/2;
          // Incremenet check if the cureent letter and next letters are same so we have to ignore it
        if(key >= letters[mid]){
          start= mid+1;
        } else {
            end= mid-1;
        }
      }
     return letters[start];
        
    }
}