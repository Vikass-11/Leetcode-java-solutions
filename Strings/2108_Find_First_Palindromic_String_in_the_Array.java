class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int left=0;int right=s.length()-1;
            boolean p=true;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    p=false;
                }
                left++;
                right--;
            }
            if(p){
                return s;
            }
        }
        return "";
    }
}