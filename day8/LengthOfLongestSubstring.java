import java.util.*;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int start=0,end = 0;
        int max = 0; 
        while(end < s.length()){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                start = Math.max(start,map.get(ch) + 1);
            }
            map.put(ch ,end);
            max = Math.max(max ,end - start+1);
            end++;
        }
        return max;
    }
}