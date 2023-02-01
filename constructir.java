// class Constructor {
//     public ThisDemo(){
//         this(10); System.out.println("First constructor");
//     }
//     public ThisDemo(int a) //overload constructor
//     {
//         this(10,20); System.out.println("Second Constructor");
//     }
//     public ThisDemo(int a, int b); {//another overloaded constructor
//     this("Ravi Kant"); System.out.println("Third Constructor");}
//     public ThisDemo(String s) // and stil another
//     {
//         System.out.println("Fourth constructor");
//     }
//     public static void main(String [] args){
//         ThisDemo d1=new ThisDemo();
//     }
// }
// -----------------------------------------------------------------------
// Chennig of the constructor or constructor overloading
class ThisDemo {
    public ThisDemo(){
        this(10); System.out.println("First constructor");
    }
    public ThisDemo(int a) { //overload constructor
        this(10,20); System.out.println("Second Constructor");
    }
    public ThisDemo(int a, int b) { //another overloaded constructor
        this("Ravi Kant"); System.out.println("Third Constructor");
    }
    public ThisDemo(String s) { // and still another
        System.out.println("Fourth constructor");
    }
    public static void main(String [] args){
        ThisDemo d1=new ThisDemo();
    }
}

// Array decleration
// int [] a,b; : 1D
// int [] []a,b; :boath 2D
// int [] []a,b[]; :a 2D, b 3D
// int [] []a,[]b; :compiation Error 
// int [] a[],[]b; :compiation Error 

