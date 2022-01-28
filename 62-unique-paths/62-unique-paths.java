class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] matrix= new int[m][n];
        
         
         for (int[] row : matrix)
            Arrays.fill(row, 1);
        
        for(int col=1;col<matrix[0].length;col++){
            for(int row=1;row<matrix.length;row++){
               matrix[row][col] = matrix[row-1][col]+matrix[row][col-1]; 
            }
        }
        
      //   ArrayList< String> paths = getMazePaths(1, 1, n, m);
        
        return matrix[m-1][n-1];
        
    }
    
    // To print all paths
    public static ArrayList< String> getMazePaths(int sr, int sc, int dr, int dc) {
    if (sr == dr && sc == dc) {                              //1
      ArrayList< String> bres = new ArrayList< >();
      bres.add("");
      return bres;
    }
    ArrayList< String> hpaths = new ArrayList< >();           //2.1
    ArrayList< String> vpaths = new ArrayList< >();           //2.2

    if (sc < dc) {
      hpaths = getMazePaths(sr, sc + 1, dr, dc);          //3.1
    }
    if (sr < dr) {
      vpaths = getMazePaths(sr + 1, sc, dr, dc);          //3.2
    }

    ArrayList< String> paths = new ArrayList< >();             //4

    for (String hpath : hpaths) {
      paths.add("h" + hpath);                              //5.1
    }

    for (String vpath : vpaths) {
      paths.add("v" + vpath);                              //5.2
    }
    return paths;                                            //6
  }
    
   
    
}