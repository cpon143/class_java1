// class Gen<T>{
//     T ob;
//     Gen(T o){
//         ob=o;
//     }
//     T getob(){
//         return ob;
//     }
//     void showType(){
//         System.out.println("Type of T is " +ob.getClass().getName());
//     }
// }



// class Gen<T, U> {
//     T obj1;
//     U obj2;
    
//     Gen(T o1, U o2) {
//         obj1 = o1;
//         obj2 = o2;
//     }
    
//     T getObj1() {
//         return obj1;
//     }
    
//     U getObj2() {
//         return obj2;
//     }
    
//     void showTypes() {
//         System.out.println("Type of T is " + obj1.getClass().getName());
//         System.out.println("Type of U is " + obj2.getClass().getName());
//     }
    
//     public static void main(String[] args) {
//         Gen<Integer, String> iOb;
//         iOb = new Gen<Integer, String>(88, "Generic Test");
//         iOb.showTypes();
        
//         int v = iOb.getObj1();
//         System.out.println("Value of obj1: " + v);
        
//         String str = iOb.getObj2();
//         System.out.println("Value of obj2: " + str);
//     }
// }


class Gen<T, U> {
    T obj1;
    U obj2;
    
    Gen(T o1, U o2) {
        obj1 = o1;
        obj2 = o2;
    }
    
    T getObj1() {
        return obj1;
    }
    
    U getObj2() {
        return obj2;
    }
    
    void showTypes() {
        System.out.println("Type of T is " + obj1.getClass().getName());
        System.out.println("Type of U is " + obj2.getClass().getName());
    }
    
    public static void main(String[] args) {
        // Example 1: <Integer, Integer>
        Gen<Integer, Integer> iOb1;
        iOb1 = new Gen<Integer, Integer>(10, 20);
        iOb1.showTypes();
        int v1 = iOb1.getObj1();
        int w1 = iOb1.getObj2();
        System.out.println("Value of obj1: " + v1);
        System.out.println("Value of obj2: " + w1);

        // Example 2: <Integer, Double>
        Gen<Integer, Double> iOb2;
        iOb2 = new Gen<Integer, Double>(10, 20.5);
        iOb2.showTypes();
        int v2 = iOb2.getObj1();
        double w2 = iOb2.getObj2();
        System.out.println("Value of obj1: " + v2);
        System.out.println("Value of obj2: " + w2);

        // Example 3: <Integer, String>
        Gen<Integer, String> iOb3;
        iOb3 = new Gen<Integer, String>(10,"Hello World");
        iOb3.showTypes();
        int v3 = iOb3.getObj1();
        String w3 = iOb3.getObj2();
        System.out.println("Value of obj1: " + v3);
        System.out.println("Value of obj2: " + w3);
        }
        }
