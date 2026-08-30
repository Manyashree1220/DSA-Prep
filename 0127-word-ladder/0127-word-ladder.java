class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);
        if(!set.contains(endWord))
            return 0;
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);

        int lev=1;
        while(!q.isEmpty())
        {
            int size=q.size();

            for(int i=0;i<size;i++)
            {
                String word=q.poll();
                char arr[]=word.toCharArray();
                for(int j=0;j<arr.length;j++)
                {
                    char og=arr[j];
                    for(char c='a';c<='z';c++)
                    {
                        arr[j]=c;
                        String nword=new String(arr);

                        if(nword.equals(endWord))
                            return lev+1;

                        if(set.contains(nword))
                        {
                            q.offer(nword);
                            set.remove(nword);
                        }
                    }
                    arr[j]=og;
                }
            }
            lev+=1;
        }
        return 0;
    }
}