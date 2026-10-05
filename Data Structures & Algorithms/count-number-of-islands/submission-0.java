class Solution {
    int[] x={-1,0,1,0};
    int[] y={0,1,0,-1};
    public int numIslands(char[][] grid) {
        int r=grid.length, c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] g, int i, int j){
        if(i<0 || i>=g.length || j<0 || j>=g[0].length || g[i][j]!='1') return;
        g[i][j]='2';
        for(int k=0;k<4;k++){
            int a=i+x[k];
            int b=j+y[k];
            dfs(g,a,b);
        }
    }
}
