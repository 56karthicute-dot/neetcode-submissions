class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r) {
            char c1 = s.charAt(l);
            char c2 = s.charAt(r);
            if(!isValid(c1)){
                l++; continue;
            }
            else if (!isValid(c2)){
                r--; continue;
            }
            else if(Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isValid(char c) {
        return (c>='a' && c<='z') ||
        (c>='A' && c<='Z') ||
        (c>='0' && c<='9');
    }

}
