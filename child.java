// class Parent {

    
//     void f1(){
//         System.out.println("parent");
//     }
//     }
    
//     class Child extends Parent {
//     int a;
//     void f1(){
//     System.out.println("child f1");
//     }
//     public static void main(String[] args){
//     Child c1 = new Child();
//     c1.a = 20;
//     c1.f1();
//     System.out.println("c1.a: " + c1.a);
//     }
//     }


// class Test {
//     int a = 7;


// public static void main(String[] args) {
//     Test t1 = new Test();
//     t1.a = 20;
//     System.out.println(t1.a);
// }
// }

// class Test {
//    final int a;
// //    final int a=20;

// //    { a=20;}
// Test (){a=25;}


// public static void main(String[] args) {
//     Test t1 = new Test();
//     // t1.a = 20;
//     System.out.println(t1.a);
// }
// }


// class Parent {
//     Parent(int a) {
//         System.out.println("Parent"+a);
//     }
// }

// class Child extends Parent {
//     Child() { super(7);
//         System.out.println("Child");
//     }
// }

// class Child1 extends Child {
//     Child1() { 
//         System.out.println("Child1");
//     }
//     public static void main(String [] args){
//         Child1 c1 = new Child1();
//     }
// }


// class Test{
//     int a;
//     int b;
//     Test( int a, int b){
//        this.a=a;
//        this.b=b;
//     }
//     public static void main(String [] args){
//         Test t1=new Test(3,4);
//         Test t2=new Test(3,4);
//         System.out.println(t1.a+" "+ t1.b);
//         System.out.println(t2.a+" "+ t2.b);

//     }
// }


class Test{
    Test(){
        this(10);
        System.out.println("13t count");
    }

Test (int a){
    this(7,5);
    System.out.println("One Parameter");
}
    Test(int a, int b){
        this("Hello");
        System.out.ptintln("Two parameter const");
    }
    Test (String aa){
        System.out.println("String constroctor");
    }
    public static void main(String [] args){
        Test t1 = new Test();
    }
}