package Bitmasking;

public class SingleNumber
{
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        int leftValue=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            leftValue=leftValue ^ arr[i];
        }
        System.out.println(leftValue);
    }
}
