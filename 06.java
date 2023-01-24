import java.lang.*;
class CmdInput{
public static void main(String args[]){
System.out.println("length is: "+args.length);
int a=Integer.parseInt(args[0]);
double b=Double.parseDouble(args[1]);
double c=a+b;
for(int i=0; i<args.length; i++)
{
//System.out.println(args[0] + args[1]);
System.out.println(c);
}
}
}