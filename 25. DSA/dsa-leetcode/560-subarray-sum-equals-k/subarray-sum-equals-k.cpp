class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int res = 0;
        for(int i = 1 ; i < nums.size() ; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        unordered_map<int, int> mp;
        for(int i = 0 ; i < nums.size() ; i++) {
            if(nums[i] == k)
                res++;
            if(mp.find(nums[i] - k) != mp.end()) {
                res += mp[nums[i] - k];
            }
            mp[nums[i]]++;
        }

        return res;

        int count = 0;
        for(int i=0;i<nums.size();i++)
        {
            int sum =0;
            for(int j=i;j<nums.size();j++)
            {
                sum += nums[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
};