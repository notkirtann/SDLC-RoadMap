class Solution {
public:
    int majorityElement(vector<int>& nums) {
        //MOORE ALGO
        int count =0;
        int element = INT_MIN;
        int n = nums.size();
        int ans;

        for(int i=0; i<n; i++){

            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if (element == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        if(count > n/2){
            ans =  element;
        }
        return ans;
        
        
        //USING HASHMAP
        // map<int,int> mpp;
        // for(int i =0; i<nums.size();i++)
        // {
        //     mpp[nums[i]]++;
        // }
        // for(auto chu:mpp)
        // {
        //     if(chu.second>nums.size()/2)
        //     {
        //         return chu.first;
        //     }
        // }
        // return -1;  
    }
};