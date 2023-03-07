// // // @functionalInterface
// // interface sayable{
// //     void say(String msg);

// // }
// //  class FunctionalInterfaceExample implements sayable{
// //     public void say(String msg){
// //         System.out.println(msg);
// //     }
// //     public static void main(String [] args){
// //         FunctionalInterfaceExample fie=new FunctionalInterfaceExample();
// //         fie.say("Hello there");
// //     }
// // }


// // interface Double{
// //     default void doIT()//public{
// //     {
// //         System.out.println("Do it now");
// //     }
// // }
// // @FunctionalInterface
// // interface Sayable extends Double{
// //     void say(String msg); // abstract method
// //     // It can contain any number of Object class methods.       
// // }
// //  class functionalinterface2 implements Sayable{
// //     public void say(String msg)
// //     {
// //         System.out.println(msg);
// //     }
// //     public static void main(String[] args)
// //     {
// //         functionalinterface2 fi = new functionalinterface2();
// //         fi.say("Hello there");
// //         fi.doIT();
// //     }
// // }


// class Outer1
// {
//     void display()
//     {
//         System.out.println("This is an outer class method");
//     }
//     interface inner1
//     {
//         void display1();//abstract public
//     }
// }
// // class TestNestedInterface1 implements Outer1.inner1
// class TestNestedInterface1 extend Outer1
// {
//     public void display1()
//     {
//         System.out.println("display1 method");
//     }
//     public static void main(String...aa)
//     {
//         TestNestedInterface1 obj = new TestNestedInterface1();
//         obj.display();
//         // obj.display1();
//     }
// }


// interface Outer{
//     void show();
//     interface Inner{
//         void show1();
//     }
// }

// //class TestNestedInterface implements Outer
// class TestNestedInterface implements Outer.Inner
// {
//     public void show()
//     {
//         System.out.println("show method");
//     }
//     public void show1()
//     {
//         System.out.println("show1 method");
//     }
//     public static void main(String...aa)
//     {
//         TestNestedInterface obj = new TestNestedInterface();
//         obj.show1();
//     }
// }





// class TestNestedInterface implements Outer
// // class TestNestedInterface implements Outer.Inner
// {
//     public void show()
//     {
//         System.out.println("show method");
//     }
//     public void show1()
//     {
//         System.out.println("show1 method");
//     }
//     public static void main(String...aa)
//     {
//         TestNestedInterface obj = new TestNestedInterface();
//         // Outer obj=TestNestedInterface(); //error in show1
//         // Outer.inner obj=new TestNestedInterface(); //error in show1
//         obj.show();
//         // obj.show1();
//     }
// }


interface Outer {
    interface Inner {
        void show();
    }
}

class TestNestedInterface implements Outer.Inner {
    public void show() {
        System.out.println("show method");
    }

    public static void main(String[] args) {
        TestNestedInterface obj = new TestNestedInterface();
        obj.show();
    }
}
