class Solution {
public:
    int maximumGap(vector<int>& nums)
{
    if (nums.empty() || nums.size() < 2)            // check if array is empty or small sized
        return 0;

    sort(nums.begin(), nums.end());                 // sort the array

    int maxGap = 0;

    for (int i = 0; i < nums.size() - 1; i++)
        maxGap = max(nums[i + 1] - nums[i], maxGap);

    return maxGap;
}
};