public class Palindromic_Substrings
{
    public static void main(String[] args)
    {
        String s="aaa";

    }
    public static int Palindromic_SubstringFunc(String s)
    {
        int count=0;
        for (int axis = 0; axis < s.length(); axis++)
        {
            for (int orbit = 0; axis-orbit >=0 && axis+orbit<s.length() ; orbit++)
            {
                if(s.charAt(axis-orbit) != s.charAt(axis+orbit))
                {
                    break;
                }
                count++;

            }

        }
        for (double axis = 0.5; axis<s.length()  ; axis++)
        {
            for (double orbit = 0.5; axis - orbit >=0 && axis + orbit < s.length() ; orbit++)
            {
                if(s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit)))
                {
                    break;
                }
                count++;

            }

        }
        return count;
    }

}
