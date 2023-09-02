package Oops.Basics;

import java.util.ArrayList;

public class Student_Class
{
    public static void main(String[] args)
    {
        //ArrayList<Integer> ll=new ArrayList();
        Student s=new Student();
        s.age=27;
        s.name="Singh";
        s.Intro_Yourself();
        s.SayHey("tanish");

        Student.fun(3);

    }
}
