class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int arr[]=new int[2];
        while(l<r){
            if(numbers[l]+numbers[r] > target){
                r--;
            }
            else if(numbers[r]+numbers[l]<target){
                l++;
            }
            else{
                arr[0]=l+1;
                arr[1]=r+1;
                break;
            }

        }
         return arr;
    }
}