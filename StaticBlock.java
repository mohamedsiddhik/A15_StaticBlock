


class students7{
    String name;
    int age;
     static String teacher = "kumar";
     static {

     }




    void  display()
    {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
        System.out.println("Teacher Name : " + teacher);
    }

    static
    {
        students7.teacher = "Ravi";
    }


}
public  class StaticBlock
{
    public static void main(String[] args) {
        students7 s1 = new students7();
        students7 s2 = new students7();
        s1.age=14;
        s1.name="dhawan";
//        s1.teacher = "Ravi";
        s1.display();
        s2.name="ram";
        s2.age=17;
        s2.display();
    }
}