import java.util.*;
public class LongestSubstringWithoutRepeating {
    public  static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        int start = 0;
        for(int end =0; end < s.length();end++) {
            char ch = s.charAt(end);
            if(map.containsKey(ch)) {
                start = Math.max(start,map.get(ch)+1);
            }
            map.put(ch,end);
            maxlen = Math.max(maxlen,end-start +1);
        }
        return maxlen;
    }
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }
}