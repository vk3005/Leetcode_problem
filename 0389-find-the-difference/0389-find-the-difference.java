class Solution {
    public char findTheDifference(String s, String t) {
        char ch = t.charAt(t.length()-1);
        for(int i = 0;i<s.length();i++){
            ch ^= s.charAt(i);
            ch ^= t.charAt(i);
        }
        return ch;
    }
}