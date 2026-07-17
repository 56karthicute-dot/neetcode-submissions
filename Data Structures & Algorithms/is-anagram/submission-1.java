class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m) {
            return false;
        }
        int[] nCount = new int[26];
        int[] mCount = new int[26];
        for(int i=0;i<n;i++) {
            int x = s.charAt(i)-'a';
            int y = t.charAt(i)-'a';
            nCount[x]++;
            mCount[y]++;
        }
        for(int i=0;i<26;i++) {
            if(nCount[i]!=mCount[i]){
                return false;
            }
        }
        return true;

    }
}
