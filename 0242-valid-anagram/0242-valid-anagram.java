class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] hash1 = new int[26];
        int[] hash2 = new int[26];

        //for string s
        for(int i =0; i<s.length(); i++){
            hash1[s.charAt(i)-'a']++;
        }

        //for string t
        for(int i=0; i<t.length(); i++){
            hash2[t.charAt(i)-'a']++;
        }

        //checking if they are equal or not
        for(int i = 0; i<26; i++){
            if(hash1[i] != hash2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        Solution obj = new Solution();

        System.out.println(obj.isAnagram("anagram", "nagaram"));
    }
}