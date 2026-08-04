class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector <int> ans ;
        int left = 0, top = 0 , bottom = matrix.size()-1, right = matrix[0].size()-1 ,i,j;
        while( top <= bottom && left <= right){
            for ( j = left ; j <= right; j ++){
                    ans.emplace_back(matrix[top][j]);
            }
            top++;
            for ( i = top ; i <= bottom ; i++){
                    ans.emplace_back(matrix[i][right]);
            }
            right--;
            if (top<=bottom){
                for ( j = right; j >= left; j--){
                        ans.emplace_back( matrix[bottom][j] );
                }
            }
            if (left <= right){
            for ( i = bottom - 1 ; i >= top ; i --){
                    ans.emplace_back( matrix[i][left] );
               }
            }
                    left++;    bottom--;
        }
        return ans;
    }
};