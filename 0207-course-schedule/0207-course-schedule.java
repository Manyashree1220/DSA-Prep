class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < numCourses; i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int edge[]:prerequisites)
        {
            graph.get(edge[0]).add(edge[1]);
            // graph.get(edge[1]).add(edge[0]);

        }
        int vis[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(vis[i]==0 && dfs(graph,i,vis))
                return false;
        }
        return true;
    }
    boolean dfs(ArrayList<ArrayList<Integer>> graph,int node, int[] vis)
    {
        vis[node]=1;
        for(int adj: graph.get(node))
        {
            if(vis[adj]==1)
            {
                return true;
            }
            else if(vis[adj]==0)
            {
                if(dfs(graph,adj,vis))  
                    return true;
            }
        }
        vis[node] = 2;
        return false;

    }

}

// class Solution {
//     public boolean isCyclic(int V, int[][] edges) {

//         ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

//         for(int i = 0; i < V; i++)
//         {
//             graph.add(new ArrayList<>());
//         }
//         for(int edge[]:edges)
//         {
//             graph.get(edge[0]).add(edge[1]);
//             // graph.get(edge[1]).add(edge[0]);

//         }
//         int vis[]=new int[V];
//         for(int i=0;i<V;i++)
//         {
//             if(vis[i]==0 && dfs(graph,i,vis))
//                 return true;
//         }
//         return false;

//     }
    
// }