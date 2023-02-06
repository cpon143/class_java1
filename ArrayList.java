// public class ArrayList {
    
// }

// import java.util.ArrayList;
// class TestArrayList{
//     public static void main(String args[]){

//         ArrayList cityList= new ArrayList(); // Default size of array is 10
//         cityList.add("London");
//         cityList.add("New Yark");
//         cityList.add("paris");
//         cityList.add(34.5);
//         cityList.add("t");
//         cityList.add(2);
//         cityList.add("paris");
//         System.out.println(cityList);
//         System.out.println("List size ? " + cityList.size()); //7
//         System.out.println("Is london in the list ?" + cityList.contains("London")); //true
//         System.out.println("Is mazharul in the list ?" + cityList.contains("mazharu")); //false
//         System.out.println("the location of last Paris is in the list? " + cityList.lastIndexOf("Paris")); //6
//         System.out.println("Is the list empty?" + cityList.isEmpty());//false
//         cityList.add(2, "Beijing"); // added
//         // cityList.remove("London");
//          cityList.indexOf("Paris");//3
//          cityList.remove("Paris"); //consider as object
//         //  cityLiast.remove(cityList.indexof(2));
//         cityList.remove(2);//argumant consider as index
//         cityList.remove((Object)2); //argumant consider as object
//         cityList.set(1, "test");//replace
//         // cityList.add(12, "Bijing"); //exception add
//         (int,object);
//         for(int i = 0; i<cityList.size();i++)
//         System.out.println(cityList.get(i) + " ");


//     }
// }


// -------------------------------------------------------------------------------------------------------

// import java.util.ArrayList;

// class TestArrayList{
// public static void main(String args[]){


//     ArrayList<String> cityList = new ArrayList<>(); // Default size of array is 10
//     // ArrayList cityList= new ArrayList(); // Default size of array is 10
//     cityList.add("London");
//     cityList.add("New York");
//     cityList.add("Paris");
//     // cityList.add(34.5); // error: ArrayList only accepts objects of type String
//     // cityList.add("t");
//     // cityList.add(2);
//     cityList.add("Paris");
//     System.out.println(cityList);
//     System.out.println("List size? " + cityList.size()); //7
//     System.out.println("Is London in the list? " + cityList.contains("London")); //true
//     System.out.println("Is mazharul in the list? " + cityList.contains("mazharul")); //false
//     System.out.println("The location of last Paris is in the list? " + cityList.lastIndexOf("Paris")); //6
//     System.out.println("Is the list empty? " + cityList.isEmpty());//false
//     cityList.add(2, "Beijing"); // added
//     // cityList.remove("London");
//      cityList.indexOf("Paris");//3
//      System.out.println(cityList.indexOf("Paris"));
//      cityList.remove("Paris"); //consider as object
//     //  cityList.remove(cityList.indexOf(2)); // error: indexOf method returns an int, not an object
//     cityList.remove(2);//argument consider as index
//     cityList.remove((Object)2); //argument consider as object
//     cityList.set(1, "test");//replace
//     cityList.add(0, "Beijing"); //exception add
//     // (int, object); // error: this is not a valid statement in Java
//     for(int i = 0; i < cityList.size(); i++)
//     System.out.println(cityList.get(i) + " ");
// }
// }

// ---------------------------------------------------------------------------------------------------------

import java.util.ArrayList;

class TestArrayList{
public static void main(String args[]){


    ArrayList<Integer> cityList = new ArrayList<>(); // Default size of array is 10  <> this is diamond
    cityList.add(1);
    cityList.add(10);
    cityList.add(110);
    cityList.add(112);
    cityList.add(132);
    System.out.println(cityList);


}
}
