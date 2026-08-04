class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int total=0;
        int maxi=0;
        vector<int> Count(101);
        for(int x : nums)
        {
            Count[x]++;
            int freq = Count[x];
            if(freq>maxi)
            {
                maxi = freq;
                total = maxi;
            }
            else if (freq==maxi)
            {
                total +=maxi ;
            }
        }
         return total;
    }
};