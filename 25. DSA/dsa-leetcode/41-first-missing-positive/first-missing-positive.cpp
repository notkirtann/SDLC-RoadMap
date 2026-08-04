class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        unordered_map<int, int> mpp;
        for(auto it: nums) mpp[it]++;
        int i = 1;
        for(auto it: mpp){
            if(mpp.find(i) == mpp.end()) return i;
            i++;
        }
        //if(nums[0] = 1) return 2;
        return i;
        
    }
};