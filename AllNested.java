class AllNested
{//static nested class
static class nestedstatic
{
    int a=10;
    static int b=20;
    void display()
    {
        System.out.println("non static a = "+ a);
        System.out.println(" static b = "+ b);
    }
}
//inner class
class inner{
    int a =10;
    final static int b=20;
    //static int b=20;
    //Error: modifier static is only allowed in constant variable declarations
    void display()
    {
        System.out.println("static b= "+b);
        int a=10;//effectively filal
        System.out.println("inner a="+a);
        //local class
        class localclass
        {
            int b;
            //a=20; Error: Because a is effectively final
        }
    }
}