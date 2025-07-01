class Solution {
    public boolean isPalindrome(String s) {
        String value = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(value).reverse().toString();
        return value.equals(rev);
    }
}                                                                               