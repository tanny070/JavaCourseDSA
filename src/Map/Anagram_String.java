package Map;

import java.util.HashMap;

public class Anagram_String 
{
    public static void main(String[] args) 
    {
        String s = "anagram", t = "nagaram";
        
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) 
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(map));

            }
            map.put(s.charAt(i), null);
            
        }

        
    }
    
}
