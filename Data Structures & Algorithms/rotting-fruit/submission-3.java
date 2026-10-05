class Solution {
    int[] x={-1,0,1,0};
    int[] y={0,1,0,-1};
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0, time=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1) fresh++; 
                else if(grid[i][j]==2) q.offer(new int[]{i,j});
            }
        }
        if(fresh==0) return 0;
        while(!q.isEmpty() && fresh>0){
            int n=q.size();
            for(int i=0;i<n;i++){
                int[] curr=q.poll();
                int a=curr[0];
                int b=curr[1];
                for(int k=0;k<4;k++){
                    int nr=a+x[k];
                    int nc=b+y[k];
                    if(nr<0 || nr>=grid.length || nc<0 || nc>=grid[0].length || grid[nr][nc]!=1) continue;
                    grid[nr][nc]=2;
                    fresh--;
                    q.offer(new int[]{nr,nc});
                }
            }
            time++;
        }
        if (fresh == 0) {
            return time;
        } 
        return -1;      
    }
}
