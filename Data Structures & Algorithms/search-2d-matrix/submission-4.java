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
        // TC: O(n+m); SC: O(1) stair case:
        // int m=matrix.length,n=matrix[0].length;
        // int l=0,r=n-1;
        // while(l<m && r>=0){
        //     if(matrix[l][r]>target) r--;
        //     else if(matrix[l][r]<target) l++;
        //     else return true;
        // }
        // return false;
        // Binary search TC: O(logm+logn); SC: O(1);
        int row=matrix.length, col=matrix[0].length;
        int top=0, bottom=row-1;
        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(target>matrix[mid][col-1]) top=mid+1;
            else if(target<matrix[mid][0]) bottom=mid-1;
            else break;
        }
        if(!(top<=bottom)) return false;
        int mid=top+(bottom-top)/2;
        int l=0,r=col-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target>matrix[mid][m]) l=m+1;
            else if(target<matrix[mid][m]) r=m-1;
            else return true;
        }
        return false;
    }
}
