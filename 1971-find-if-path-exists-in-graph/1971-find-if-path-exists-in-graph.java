class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());
        for(int edge[] :edges)
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[n];
        q.offer(source);
        vis[source]=true;
        while(!q.isEmpty())
        {
            int v=q.poll();
            if(v==destination)
                return true;
            for(int adj:graph.get(v))
            {
                if(!vis[adj])
                {
                    q.offer(adj);
                    vis[adj] = true;
                }
            }
        }
        return false;
    }
    
    
    
}