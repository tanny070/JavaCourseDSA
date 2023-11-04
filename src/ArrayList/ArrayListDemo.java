package ArrayList;
5
import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();

        //Addition;

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        //size
        System.out.println(list.size());

        //adding at index
        list.add(1,70);                     // here index ranges upto list size
        System.out.println(list);


        // getting value at index
        System.out.println(list.get(2));


        // removing elements

        //list.remove(2);
        System.out.println(list);


        // updating the value at index
        list.set(1,20);
        System.out.println(list);


        //print list using for loop
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));

        }

        // print using forEach
        for(int a:list)
        {
            System.out.println(a);
        }


        // print list using forEach
        list.forEach((n) -> System.out.println(n));





    }


}
