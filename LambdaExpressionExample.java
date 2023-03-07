@FunctionalInterface
interface Drawable{
    public void draw();
    default void max(){
        System.out.println("Hello");
    }
}
@FunctionalInterface
interface Drawable1{
    public void draw();
    default void max1(){
        System.out.println("Hello1");
    }
}
 class LambdaExpressionExample2{
    public static void main(String[] args){
    int width=10;
    //with Lambda
    Drawable d2=() ->{
        System.out.println("Drawing "+ width);
    };
    d2.draw();
    d2.max();
    //Lambda Expression for Drawable
    Drawable d1=() ->{
        System.out.println("Drawing "+width);
    };
    d1.draw();
    }

}