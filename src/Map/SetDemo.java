package Map;
import java.util.*;

public class SetDemo 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        System.out.println(set);
        System.out.println(set.contains(2));


        TreeSet<Integer> set2 = new TreeSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        System.out.println(set);
        System.out.println(set.contains(2));

        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        System.out.println(set);
        System.out.println(set.contains(2));
        
        
    }
    
}
