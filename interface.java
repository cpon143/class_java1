// interface it{
//     abstract void show1(){
//         void display()
//     }
// }
// class c2{

// }
// class c3{
//     void display()
//     {
//         System.out.println("Display method");
//     }
// }
// class AllAnonymousDemo
// {
//     public static void main(String...args)
//     {
//         int obj=new it() {
//             {
//                 public void show()
//                 {
//                     System.out.println("INterface show through Anonymous");
//                 }
//                 //void display1(){
//                 //     System.out.println("Display1 new method");
//                 // }
//             };
//             //.display1(); //error : implictable types: void cannot be converted to c1()
//             obj1.show1();
//             obj1.display();
//             //obj1.display1(); error
//             new c2(){
//                 void show2(){
//                     System.out.println("Swoh2 independent method through class C2");
//                 }
//             }.show2();
//             c3 obj3=new c3()// crete the referance of c3, new: create ananoyums class, c3();
//             inherited from c3{
//                 void display()
//                 {
//                     System.out.println("Display overiding through anonumous");
//                 }
//             };
//             obj3.display();
//         }
//     }
// }

// interface it{
//     // show1() needs to be abstract since it has no body
//     abstract void show1();
    
//     // display() should be defined in its own method signature
//     abstract void display();
// }

// class c2{
//     // c2 needs to have a defined method or constructor
//     void c2Method() {
//         // do something
//     }
// }

// class c3{
//     void display()
//     {
//         System.out.println("Display method");
//     }
// }

// class AllAnonymousDemo
// {
//     public static void main(String...args)
//     {
//         it obj1 = new it() {
//             // show1() needs to be implemented
//             public void show1()
//             {
//                 System.out.println("Interface show through Anonymous");
//             }
            
//             // display() needs to be implemented
//             public void display()
//             {
//                 System.out.println("Display method");
//             }
//         };
        
//         // display1() is not part of the it interface or its implementation, so it cannot be called
//         //obj1.display1(); //error : implictable types: void cannot be converted to c1()
        
//         // show1() is part of the it interface implementation
//         obj1.show1();
//         // display() is part of the it interface implementation
//         obj1.display();
//         // display1() is not part of the it interface or its implementation, so it cannot be called
//         //obj1.display1(); error
        
//         new c2(){
//             // show2() needs to be defined since c2 has no defined methods or constructors
//             void show2(){
//                 System.out.println("Swoh2 independent method through class C2");
//             }
//         }.show2();
        
//         c3 obj3 = new c3() {
//             // display() needs to be overridden since c3 has a defined display() method
//             void display()
//             {
//                 System.out.println("Display overiding through anonumous");
//             }
//         };
//         obj3.display();
//     }
// }


interface it 
{
void show();
}

abstract class c1
{
abstract void show1();
void display()
{
}
}
class c2
{
}
class c3
{
void display()
{
System.out.println("Display method");
}
}
class AllAnonymousDemo 
{
public static void main(String...aa)
{
it obj= new it()//not create the object of it it is basically inherited from it()
{
public void show()
{
System.out.println(" interface Show thro anonymous");
}
//void display(){} // error
};
obj.show();

c1 obj1= new c1()// not create the object of C1 it is basically inherited from C1()
{
public void show1()
{
System.out.println("Abstract Show1 thro abstract");
}
public void display()
{
System.out.println("display of abstract class");
}
/*void  display1()
{
System.out.println("display1 new method");
}*/
};
//.display1();// error:incompatible types: void cannot be converted to c1
obj1.show1();
obj1.display();
//obj1.display1(); error

new c2()
{
void show2()
{
System.out.println("Show2 independent method thro class C2");
}
}.show2();

new AllAnonymousDemo()
{
void show2()
{
System.out.println("Show2 independent method Class AllAnonymousDemo");
}
}.show2();
c3 obj3= new c3()//  create the reference of C3,new:craete anonymous class,C3(): inherited from C3
{
void display()
{
System.out.println("display overriding thro anonymous");
}};
obj3.display();
}
}