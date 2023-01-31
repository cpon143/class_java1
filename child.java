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

class Test {
   final int a;
//    final int a=20;

//    {
//     a=20;
//    }
Test (){a=25;}


public static void main(String[] args) {
    Test t1 = new Test();
    // t1.a = 20;
    System.out.println(t1.a);
}
}