class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String s1= s.toLowerCase();
        String res = new StringBuilder(s1).reverse().toString();
        if(res.equals(s1)) return true;
        else return false;
    }
}
