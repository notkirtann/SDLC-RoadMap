class Solution {
public:
    void rotate(vector<int>& arr, int k) {
        int n = arr.size();
        k = k % n;
        if (k == 0) return;
        int temp[k];
        int in = 0;
        // Store the last k elements in the temp vector
        for (int i = n - k; i< n; i++)
        {
            temp[in] = arr[i];
            in++;
        }
        // Shift the remaining elements to their correct positions
        int count = 1;
        for (int i = n - k - count; i >= 0; --i)
        {

            arr[i + k] = arr[i];
        }
        // Copy the saved elements back to the start of the arraay
        for (int i = 0; i< k;i++)
        {
            arr[i] = temp[i];
        }
    }
};