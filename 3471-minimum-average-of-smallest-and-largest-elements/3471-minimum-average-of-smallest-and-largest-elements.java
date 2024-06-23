
class Solution {
    public double minimumAverage(int[] nums) {
        if (nums.length == 0) {
            return 0.0;  // or throw an exception based on the requirements
        }

        ArrayList<Double> arr = new ArrayList<>();

        int i = 0;
        int j = nums.length - 1;
        Arrays.sort(nums);

        while (i < j) {
            double x = (double) (nums[i] + nums[j]) / 2.0;
            arr.add(x);
            i++;
            j--;
        }

        double small = Double.MAX_VALUE;
        for (int p = 0; p < arr.size(); p++) {
            small = Math.min(small, arr.get(p));
        }

        return small;
    }
}
