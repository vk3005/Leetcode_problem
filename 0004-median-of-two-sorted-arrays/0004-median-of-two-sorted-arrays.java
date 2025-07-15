class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int merged[] = new int[num1.length + num2.length];
        int i =0,j=0,k=0;

        while(i<num1.length && j<num2.length){
            if(num1[i]<num2[j])
                merged[k++] = num1[i++];
            
            else
                merged[k++]=num2[j++];
            
        }
        while(i<num1.length)
            merged[k++] = num1[i++];
        
        while(j<num2.length)
            merged[k++] = num2[j++];
        

        int mid = merged.length/2;

        if(merged.length%2==0)
            return (merged[mid-1] + merged[mid])/2.0;
        
        else
            return merged[mid];
        
    }
}