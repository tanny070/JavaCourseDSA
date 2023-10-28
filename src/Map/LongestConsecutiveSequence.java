package Map;

import java.util.HashMap;

public class LongestConsecutiveSequence 
{
    public static void main(String[] args) 
    {
        int nums[]={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
        
    }

    public static int longestConsecutive(int[] nums) 
    {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            if(map.containsKey(nums[i] - 1))
            {
                map.put(nums[i], false);
            }
            else
            {
                map.put(nums[i], true);
            }

            if(map.containsKey(nums[i] + 1))
            {
                map.put(nums[i] + 1, false);
            }
            
        }
        int ans =0;
        for(int key : map.keySet())
        {
            if(map.get(key))
            {
                int c = 0;
                while (map.containsKey(key)) 
                {
                    key++;
                    c++;
                }
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }
}
