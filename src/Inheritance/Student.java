package Inheritance;

public class Student
{
    String name = "Tanish";
    int age = 27;

    @Override

    // Here we are overiding Object class to String method which automatically call when we try to print s object of Student class
    public String toString()
    {
        return this.name+" "+this.age;
    }
    public static void main(String[] args)
    {
        Student s = new Student();
        System.out.println(s);


    }
}
