class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        for(int i = 0;i<n;i++){
            int index = Math.abs(nums[i])-1;//ithu correcta
            if(nums[index]>0){
                nums[index]= -nums[index];
            }
        }
            List<Integer> result = new ArrayList<>();
            for(int i = 0;i<n;i++){
                if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}