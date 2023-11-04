package Map;
import java.util.*;


public class Map_Demo
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("rajesh",32);
        map.put("mahesh",32);
        map.put("tony",32);
        map.put("shyam",32);
        map.put("ram",32);
        map.put("amita",32);

        for(String key:map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }

        System.out.println(map.get("Amita"));

        System.out.println(map.containsKey("amita"));

        System.out.println(map.remove("amita"));

        System.out.println(map.size());


    }
}