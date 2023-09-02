package Oops.Basics;

public class Student
{
    String name;
    int age;



    public void Intro_Yourself()
    {
        System.out.println("My name is "+name+" and age is "+age);
    }

    public void SayHey(String name)
    {
        System.out.println(this.name+" Say Hey "+name);
    }

    public static void fun(int x)
    {
        System.out.println("I am in fun "+x);
    }
}
