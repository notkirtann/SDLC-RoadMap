class Solution {
public:
    void sortColors(vector<int>& nums) 
    {
        int left=0;
        int mid=0;
        int right=nums.size()-1;
        while(left<=right&&mid<=right){
            if(nums[mid]==0){
                swap(nums[mid],nums[left]);
                mid++;
                left++;
            }
            else if(nums[mid]==1){
                mid++;

            }
            else{
                swap(nums[mid],nums[right]);
                right--;
            }
        }
    }

    
        // ---------------------------------------------
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;
        // for(int i=0;i<nums.size();i++)
        // {
        //     if(nums[i]==0) count0++;
        //     else if(nums[i]==1) count1++;
        //     else count2++;
        // }
        // for(int i=0;i<count0;i++) nums[i]=0;
        // for(int i=count0;i<count0+count1;i++) nums[i]=1;
        // for(int i=count0+count1;i<nums.size();i++) nums[i]=2;
        // ---------------------------------------------


        // sort(nums.begin(),nums.end());
    
};