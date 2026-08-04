class Solution {
public:
    int missingNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        int val=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]!=val)
            {
                return i;
            }
            val++;
        }
        return n;
    }
};