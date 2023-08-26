package String;
import java.util.*;

public class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        scanner.close();

        boolean isPalindrome=true;
        int i=0;
        int j=input.length()-1;

        while(i<j)
        {
            if(!(input.charAt(i) == input.charAt(j)))
            {
                isPalindrome=false;
            }
            i++;
            j--;
        }

        if(isPalindrome)
        {
            System.out.println("The string is palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }

    }
}
