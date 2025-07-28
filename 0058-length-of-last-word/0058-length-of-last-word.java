class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove trailing spaces
        int last = s.lastIndexOf(' ');
        return s.length() - last - 1;
    }
}