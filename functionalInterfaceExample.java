// // @functionalInterface
// interface sayable{
//     void say(String msg);

// }
//  class FunctionalInterfaceExample implements sayable{
//     public void say(String msg){
//         System.out.println(msg);
//     }
//     public static void main(String [] args){
//         FunctionalInterfaceExample fie=new FunctionalInterfaceExample();
//         fie.say("Hello there");
//     }
// }


interface Double{
    default void doIT()//public{
    {
        System.out.println("Do it now");
    }
}
@FunctionalInterface
interface Sayable extends Double{
    void say(String msg); // abstract method
    // It can contain any number of Object class methods.       
}
 class functionalinterface2 implements Sayable{
    public void say(String msg)
    {
        System.out.println(msg);
    }
    public static void main(String[] args)
    {
        functionalinterface2 fi = new functionalinterface2();
        fi.say("Hello there");
        fi.doIT();
    }
}