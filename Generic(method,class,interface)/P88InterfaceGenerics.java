interface a<T>
{
T max(T z);
}
class P88InterfaceGenerics<T> implements a<T>
{
public T max(T z)
{
return z;
}
public static void main(String args [])
{
P88InterfaceGenerics<Integer> obj =new P88InterfaceGenerics<Integer>();
int abc=obj.max(33);
System.out.println(abc);
}
}

/*Generic method
 a=[1,2,3,4,5]
 value=2 or 4
 a=["one","two","three"]
 value=one or five
 */