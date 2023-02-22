//  class LogicStringBuilder {
//     void stringBuilderMethods(){
//         //StringBuilder sb=new StringBuilder(50);
//         //sb.append("Hello my students.");
//         StringBuilder sb=new StringBuilder("Hello my students.");
//         sb.append(" How are you?");
//         System.out.println(sb);
//         System.out.println(sb.length());
//         sb.setLength(30);
//         //System.out.println(sb.capacity());
//         System.out.println(sb.length());
//         System.out.println(sb);
//         sb.setCharAt(2,'w');
//         System.out.println("setCharA"+sb);
//         sb.reverse();
//         System.out.println("reverse"+sb);
//         sb.reverse();
//         sb.insert(2,"my");
//         System.out.println("insert"+sb);
//         sb.deleteCharAt(5);
//         System.out.println("deleteCharAT"+sb);
//         sb.delete(5,10);
//         System.out.println("delete"+sb);
//         System.out.println(sb.substring(5));
//         System.out.println(sb);
//         System.out.println(sb.substring(5,7));
//         StringBuilder b1=new StringBuilder("Hello");
//         //StringBuilder b3="Hello";//not allowed
//         StringBuilder b2=new StringBuilder("Hello");
//         System.out.println("b2 equals b2="+b1.equals(b2));//logical error reason equals do not comparision of content and b1 and b2 are not same object
//         System.out.println("b1 equals b2 toString()="+b1.toString().equals(b2.toString()));//false
//     }
        
    
// public static void main(String[] args) {
//         LogicStringBuilder lsb=new LogicStringBuilder();
//         lsb.stringBuilderMethods();
//     }
// }


//-------------------------------------------------------------------------------------

class StringBuilderEnsureCapacity{
    public static void main(String []args){
        StringBuilder bs6=new StringBuilder();
        System.out.println(bs6.capacity());//16
        StringBuilder bs5=new StringBuilder("Hello"); //16+5
        System.out.println(bs5.capacity());//21
    }
}