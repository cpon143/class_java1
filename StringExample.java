// public class StringExample {
//     public static void main(String args[]){
//         String s="Hello Student";
//         String s1="Hello Student";
//         System.out.println(s.charAt(3)); //1
//         System.out.println(s.startsWith("hello")); //false
//         System.out.println(s.endsWith("ents")); //true
//         boolean b=s.endsWith("ents");
//         System.out.println(b); //true
//         System.out.println(s.equals(s1));//false
//         System.out.println(s.equalsIgnoreCase(s1)); //false
//         System.out.println(s.length()); //16
//         System.out.println(s1.indexOf('s'));//6
//         System.out.println(s1.indexOf('s',6));//6
//         System.out.println(s1.lastIndexOf('s'));//13
//         System.out.println(s1.lastIndexOf('s',13));//13
//         String ss="one, tow ,three four";
//         String hh="one$tow.three$four";
//         String[] sa1=hh.split("\\$");
//         System.out.println(sa[0]);
//         System.out.println(sa[1]);
//         System.out.println(sa[2]);



//     }
// }


// public class StringExample {
//     public static void main(String args[]){
//         String s="Hello Stusdents";
//         String s1="Hello Students";
//         System.out.println(s.charAt(3)); //l
//         System.out.println(s.startsWith("hello")); //false
//         System.out.println(s.endsWith("ents")); //true
//         boolean b=s.endsWith("ents");
//         System.out.println(b); //true
//         System.out.println(s.equals(s1));//true
//         System.out.println(s.equalsIgnoreCase(s1)); //true
//         System.out.println(s.length()); //16
//         System.out.println(s1.indexOf('s'));//6
//         System.out.println(s1.indexOf('s',6));//6
//         System.out.println(s1.lastIndexOf('s'));//13
//         System.out.println(s1.lastIndexOf('s',13));//13
//         String ss="one, tow ,three four";
//         String hh="one$tow.three$four";
//         String[] sa1=hh.split("\\$");
//         System.out.println(sa1[0]);
//         System.out.println(sa1[1]);
//         System.out.println(sa1[2]);
//     }
// }

// ------------------------------------------------------------------------------------------

//      class Main {
//     public static void main(String[] args) {
//       System.out.println("My name is \"Mazharul\"");
//     }
//   }

// --------------------------------------------------------------------------------------------

// class Main {
//         public static void main(String[] args) {
// String ss1="one, tow ,three four";
//         String hh="one$tow.three$four";
//         String[] sa1=hh.split("$");
//         System.out.println(sa1[0]);
//         System.out.println(sa1[1]);
//         System.out.println(sa1[2]);
//     }
// }
  

// ------------------------------------------


public class StringExample {
    public static void main(String args[]){
        String s="Hello Stusdents";
        String s1="Hello Students";
        System.out.println(s.charAt(3)); //l
        System.out.println(s.startsWith("hello")); //false
        System.out.println(s.endsWith("ents")); //true
        boolean b=s.endsWith("ents");
        System.out.println(b); //true
        System.out.println(s.equals(s1));//true
        System.out.println(s.equalsIgnoreCase(s1)); //true
        System.out.println(s.length()); //16
        System.out.println(s1.indexOf('s'));//6
        System.out.println(s1.indexOf('s',6));//6
        System.out.println(s1.lastIndexOf('s'));//13
        System.out.println(s1.lastIndexOf('s',13));//13
        String ss="one, tow ,three four";
        String hh="one$tow.three$four";
        String[] sa1=hh.split("\\$");
        System.out.println(sa1[0]);
        System.out.println(sa1[1]);
        System.out.println(sa1[2]);
        String str ="Hello World";
        int length = str.length();
        System.out.println("Length of string is : " + length);
        String s11= "Welcome to Java";
        String s2=new String("Welcome to Java");
        String s3 = "Welcome to Java";
        String s10 = "Welcome to Java";
        String s4 =new String("Welcome to Java");
        System.out.println("s11== s2 is :" + (s11 == s2)); //referance
        // matching false
        System.out.println("s11== s3 is :" + (s11 == s3)); //true
        System.out.println("s2== s3 is :" + (s2 == s3)); //false
        System.out.println("s3== s4 is :" + (s3 == s4)); //false
        System.out.println("s3== s10 is :" + (s3 == s10)); //true
        String s5= new String("Hello");
        String s6= new String("Welcome");
        String s7 ="Hello world";
        if (s5.equals(s6)){
            System.out.println("s5 and s6 having same content");

        }else{
            System.out.println("1no");
        }
        if(s5==s6){
            System.out.println("s5 and s6 having same referance");  
        }else{
            System.out.println("2nd no");
        }
        if(s5.compareTo(s7)>0){
            System.out.println("s5 is greater then s7");
        }else{
            System.out.println("3rd no");
        }


    }
}