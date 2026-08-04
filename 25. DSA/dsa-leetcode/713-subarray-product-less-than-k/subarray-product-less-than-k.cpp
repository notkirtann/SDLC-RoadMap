class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) 
    {
        if(!k or k==1) return 0;
        int start = 0, end = 0, ans = 0, n = nums.size();
        long long product = 1;
        while(end<n)
        {
            product *= nums[end];
            while(product >= k)
            {
                product /= nums[start];
                start++;
            }
            ans += (end-start+1);
            end++;
        }
        return ans;
    }
};