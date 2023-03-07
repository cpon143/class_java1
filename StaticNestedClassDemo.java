class OuterClass {
    // static variable
    static int outer_x = 10;
    // instance variable (non-static)
    int outer_y = 20;
    // private variable
    private static int outer_private = 30;
    // static nested class
    static class StaticNestedClass {
        void display() {
            // can access static variable of outer class
            System.out.println("outer_x = " + outer_x);
            // can access private static variable of outer class
            System.out.println("outer_private = " + outer_private);
            // the following statement gives compilation error
            // as static nested class cannot directly access non-static variables
            // System.out.println("outer_y = " + outer_y);
        }
    }
}

// Driver class
public class StaticNestedClassDemo {
    public static void main(String[] args) {
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}
