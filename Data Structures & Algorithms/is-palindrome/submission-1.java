class Solution {
    public boolean isPalindrome(String s) {

        if(s.length()<2){
            return true;
        }
        s=s.toLowerCase();

        int i=0;
        int j=s.length()-1;

boolean res=true;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
if(s.charAt(i)!=s.charAt(j)){
    return false;
}
i++;
j--;
        }
        return res;
    }
}
