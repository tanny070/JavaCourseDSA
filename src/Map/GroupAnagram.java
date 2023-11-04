package Map;

import java.util.*;
public class GroupAnagram 
{
    public static void main(String[] args) 
    {
        
    }
    public static String key(String s)
    {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        String ans = "";
        for (int i = 0; i < freq.length; i++) 
        {
            ans += freq[i] + " ";
        }
        return ans;
    }
    public static List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) 
        {
            String s = strs[i];
            String key = key(s);
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        } 
        List<List<String>> ll = new ArrayList<>();
        for(String key : map.keySet())
        {
            ll.add(map.get(key));
        } 
        return ll;
    }
}
