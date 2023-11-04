package Hash;

public class HashMapClient 
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ankit", 77);
        map.put("Kunal", 76);
        map.put("Aditya", 79);
        map.put("Amit", 81);
        map.put("bob", 82);
        map.put("Alice", 85);
        map.put("andrew", 87);
        System.out.println(map);
        System.out.println(map.get("Kunal"));
    }
        
}
