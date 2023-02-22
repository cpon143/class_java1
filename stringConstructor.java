//  class strchar{
//     public static void main(String args[]){
//         char [] a= {'c','o','n','g','r','a','t','s'};
//         byte [] b= {82,25,92,73,75,65,48,84};
//         String s1=new String(a);
//         System.out.println(s1);
//         String s2= new String(a,2,5);
//         System.out.println(s2);
//         String s3= new String(s1);
//         System.out.println(s3);
//         String s4= new String(b);
//         System.out.println(s3);
//     }
// }

class split{
    public static void main(String args[]){
        String str = "have-fun-in-java@blogspot@in";
        String [] s = str.split("\\.", -2);
        for(String  x: s) System.out.println(x);
    
    }
}