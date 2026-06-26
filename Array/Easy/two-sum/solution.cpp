class Solution {
public:
vector<int> twoSum(vector<int>& nums, int target) {
int n=nums.size();
vector<int>ans;
   for(int i=0;i<n;i++)
    {
        int e=i;
        for(int j=i;j+1<n;j++)
        {
            if(nums[i]+nums[j+1]==target)
            {
            ans.push_back(e);
            ans.push_back(j+1);
            }
        }
    }
    return ans;
 }
};