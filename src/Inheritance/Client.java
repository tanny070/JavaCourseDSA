package Inheritance;
public class Client
{
    public static void main(String[] args)
    {

        // First Case
        /*P obj = new P();
        obj.fun();
        obj.fun1();
        System.out.println(obj.d);
        System.out.println(obj.d1);


        // Second Case
        P obj2 = new C();
        System.out.println(obj2.d1);
        System.out.println(((C)obj2).d2);
        obj2.fun();
        obj2.fun();
*/


        // Not allowed
        /*C obj =  new P();
        obj.fun2();
        obj.fun1();
        obj.fun();*/

        C obj =new C();
        obj.fun();
        obj.fun();
        obj.fun2();
        obj.fun1();
    }
}
