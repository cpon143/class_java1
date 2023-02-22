// class Parent{
//     int a=40;
// }
// class Child extends Parent{
//     int a=60;
// }
// void display(){
//     System.out.println(a);
//     System.out.println(super.a);

// }
// class Test{
//     public static void main(Strings []args){
//         Child c1=new Child();
//         c1.display();
//     }
// }

class Parent {
    int a = 40;
}

class Child extends Parent {
    int a = 60;

    public void display() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

 class Test {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
    }
}

