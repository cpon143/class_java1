//  abstract class Bank {
    
//     public void Rules() {
//         System.out.println("These are the rules of the bank.");
//     }
    
//     public abstract void ROI();
// }

//  class SBI extends Bank {
    
//     public void ROI() {
//         System.out.println("SBI's ROI is 5%");
//     }
// }

//  class ICICI extends Bank {
    
//     public void ROI() {
//         System.out.println("ICICI's ROI is 6%");
//     }
// }

//  class Main {
//     public static void main(String[] args) {
//         Bank b1 = new SBI();
//         Bank b2 = new ICICI();
        
//         b1.Rules();
//         b1.ROI();
        
//         b2.Rules();
//         b2.ROI();
//     }
// }


interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
    public static void main(String [] args){
        A7 obj=new A7();
        obj.print();
        obj.show();
    }
}