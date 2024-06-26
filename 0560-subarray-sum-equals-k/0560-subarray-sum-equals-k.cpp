class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n=nums.size();
        int first=0;
        int second=0;
        int prefix=0;
        int ans=0;
        unordered_map<int,int>map;
        map[0]=1;
        while(second<n){
            prefix+=nums[second];
            int target=prefix-k;
            if (map.count(target)){
                ans+=map[target];
                first++;
            }
            map[prefix]++;
            second++;
        }
        return ans;
    }
};