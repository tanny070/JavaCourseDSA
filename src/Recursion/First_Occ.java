package Recursion;

public class First_Occ
{
    public static void main(String[] args)
    {
        int[] arr={2,3,5,7,8,5,2,5,11};
        int item=11;

        System.out.println(isNumberExists(arr,item,0));

    }

    public static int isNumberExists(int[] arr,int item,int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == item)
        {
            return i;
        }

        return isNumberExists(arr,item,++i);

    }
}
