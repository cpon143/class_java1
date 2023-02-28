// // Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:
// interface Drawable {
//     void draw();
//     default void msg() {
//         System.out.println("default method");
//     }
// }

// class Rectangle implements Drawable {
//     public void draw() {
//         System.out.println("drawing rectangle");
//     }
// }

// class TestInterfaceDefault {
//     public static void main(String args[]) {
//         Drawable d = new Rectangle();
//         d.draw();
//         d.msg();
//     }
// }



// --------------------------------------------------------



// interface Drawable {  
//     void draw();  
//     default int cube(int x) {
//         return x * x * x;
//     }
// }

// class Rectangle implements Drawable {  
//     public void draw() {
//         System.out.println("Drawing rectangle.");
//     }
// }

// class TestInterfaceStatic {  
//     public static void main(String args[]) {  
//         Drawable d = new Rectangle();  
//         Rectangle d1= new Rectangle();
//         d.draw();  
//         d1.draw();  
//         // System.out.println(Drawable.cube(7));  
//         System.out.println(d1.cube(7));  
//     }  
// }


// ----------------------------------------


// interface A {
//     default void add() {
//         System.out.println("A hello");
//     }
// }

// interface B {
//     default void add() {
//         System.out.println("B hello");
//     }
// }

// class Check implements A, B {
//     public void add() {
//         System.out.println("Check hello");
//         A.super.add();
//         B.super.add();
//     }
    
//     public static void main(String[] args) {
//         Check c = new Check();
//         c.add();
//     }
// }


// ------------------------------------------

// interface A {  
//     default void add() {
//         System.out.println("A hello");
//     }
// }

// interface B { 
//     default void add() {
//         System.out.println("B hello");
//     }
// }

// class check implements A, B {
//     public void add() {
//         // Here you can choose which implementation of add() to use
//         // For example, to call the implementation of A:
//         A.super.add();
//     }

//     public static void main(String[] args) {
//         check c = new check();
//         c.add();
//     }
// }

// ---------------------------------------------




// write a program in which define a class with one abstract method int add(int a, int b) and a variable a with valur 10

abstract class MyClass {
    int a = 10;
    abstract int add(int a, int b);
}

 class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass() {
            // @Override
            int add(int a, int b) {
                return a + b;
            }
        };

        int result = obj.add(5, 7);
        System.out.println("Result: " + result);
        System.out.println("Variable a: " + obj.a);
    }
}
