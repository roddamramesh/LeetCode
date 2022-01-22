class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<Edge>[] graph = new ArrayList[n];
        
        for(int i=0;i<n;i++){
          graph[i]= new ArrayList<>();  
        }
        
        for(int[] edge : edges){
            graph[edge[0]].add(new Edge(edge[0],edge[1]));
            graph[edge[1]].add(new Edge(edge[1],edge[0]));
        }
        
        boolean[] visitedPaths = new boolean[n];
        return hasPath(graph,source,destination,visitedPaths);
    }
    
    public boolean hasPath(List<Edge>[] graph,int source,int destination,boolean[] visitedPaths) {
        
        if(source==destination)
            return true;
        
        visitedPaths[source]=true;
        for(Edge edge: graph[source]){
            if(visitedPaths[edge.destination]==false){
                if(hasPath(graph,edge.destination,destination,visitedPaths))
                    return true;  
            }
           
        }
        return false;
    }
    
}

class Edge{
    int source;
    int destination;
    
    public Edge(int source,int destination){
        this.source=source;
        this.destination=destination;
    }
}


