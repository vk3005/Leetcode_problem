class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxdiagnol = 0;
        int maxarea = 0;

        for(int rect[] : dimensions){
            int length = rect[0];
            int width = rect[1];

            double diagnol = Math.sqrt(length*length+width*width);
            int area = length * width;

            if(diagnol>maxdiagnol){
                maxdiagnol = diagnol;
                maxarea = area;
            }
            else if(diagnol == maxdiagnol && area>maxarea){
                maxarea = area;
            }
        }
        return maxarea;
    }
}