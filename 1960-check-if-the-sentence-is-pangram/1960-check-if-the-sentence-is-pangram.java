class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] a = new boolean[25];

        for(char c = 'a';c<='z';c++){
            if(!sentence.contains(String.valueOf(c)))
                return false;
        }
            return true;
        }
    }
