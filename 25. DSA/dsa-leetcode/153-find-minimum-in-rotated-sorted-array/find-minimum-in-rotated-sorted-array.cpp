class Solution {
public:
    int findMin(vector<int>& nums) {
        int low = 0;
        int high = nums.size() - 1;
        int minNumber = nums[0];

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            minNumber = min(minNumber,nums[mid]);

            if(nums[mid] >= nums[low])
            {
            minNumber = min(minNumber,nums[low]);
            low = mid + 1;
            }
            else
            {
            minNumber = min(minNumber,nums[mid]);
            high = mid - 1;
            }
        }

        return minNumber;
    }
};