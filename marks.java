import java.util.*;
class Student
{
int subject;
int [] marks;

public static void main()
{
Scanner sc=new Scanner(System.in);
static subject =sc.nextInt();
 static marks = new int[subject];
for (int i=0; i<subject; i++)
{
marks[i]=sc.nextInt();
}
for (int i=0; i<subject; i++)
{
System.out.println(marks[i]);
}
}
}