class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
            ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
            int res[]=new int[numCourses];
            for(int i=0;i<numCourses;i++)
            {
                graph.add(new ArrayList<>());
            }
            for(int edge[]:prerequisites)
                graph.get(edge[1]).add(edge[0]);
            int vis[]=new int[numCourses];
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<numCourses;i++)
            {
                if(vis[i]==0)
                {
                    if(!dfs(graph,vis,i,list))
                        return new int[0];
                }
            }
            for(int i=0;i<numCourses;i++)
                res[i]=list.get(numCourses-1-i);
            return res;

    }
    boolean dfs(ArrayList<ArrayList<Integer>> graph, int vis[],int node,ArrayList<Integer> s)
    {
        vis[node]=1;
        for(int adj:graph.get(node))
        {
            if(vis[adj]==1)
                return false;
            if(vis[adj]==0)
            {
                if(!dfs(graph,vis,adj,s))
                    return false;
            }
                
        }
        vis[node]=2;
        s.add(node);
        return true;
    }
}