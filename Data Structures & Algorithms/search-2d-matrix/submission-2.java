class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // TC: O(n*m); SC:O(1);(brute force)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // stair case:
        int m=matrix.length,n=matrix[0].length;
        int l=0,r=n-1;
        while(l<m && r>=0){
            if(matrix[l][r]>target) r--;
            else if(matrix[l][r]<target) l++;
            else return true;
        }
        return false;
    }
}
