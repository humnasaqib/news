import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class news {
    public static void main(String[] args){



ArrayList<String> NamesArrayList = new ArrayList<>(Arrays.asList("Humna", "Taha", "Ayesha","Dua","Khatija","Mujtaba","Zaido","Hani")); // array list will exapnd and shrnik the size automatically.
// makes porgramming a lot easier.
        //with As list you cna mess around with the values.
        // Array list can only hold objects but supports wrapper types for primitives.
    for (String x: NamesArrayList){
        System.out.println(x);
    }


        System.out.println();
        Collections.sort(NamesArrayList);

    // After Sorting
        System.out.println("After sorting.........");
        System.out.println();
        for (String x : NamesArrayList){
            System.out.println(x);

        }
        System.out.println();
    Collections.shuffle(NamesArrayList);
        // Shuffling
        System.out.println("After shuffling......");
        System.out.println();
        for (String x : NamesArrayList){
            System.out.println(x);
        }
        System.out.print("\n");

// ***********Elements that are found in an ArrayList*******
        if(NamesArrayList.contains("Taha")){

            System.out.println(" Taha was found at position " + NamesArrayList.indexOf("Taha"));
        }else{

            System.out.println("Taha was not found");

}


// ************** Elements not found in an array list********



String nonexistentElement = "Saad";
        System.out.println( nonexistentElement + " was found at position "+ NamesArrayList.indexOf(nonexistentElement));
        System.out.print("\n");


//********** Converting ArrayList into an Array**********
        System.out.print("\n");
        System.out.println("Converting arraylist into array");
        System.out.print("\n");
        String [] stringArray = new  String [NamesArrayList.size()];
        NamesArrayList.toArray(stringArray);
        for (String string : stringArray){
            System.out.println(string);
        }
        System.out.print("\n");
        // ************ Converting Array into ArrayList********

        System.out.println("Converting array into arraylist");
        System.out.print("\n");
      List<String> newlist = Arrays.asList(stringArray);
        System.out.println(newlist);


        System.out.println("I made a change");


        //********** Difference between Collection and Collections***********
        /*

        Abstract class and interface has difference that Abstract contains atleast 1 abstract method as well as regular methods.
        Having that 1 abstract method makes it an abstract class. Interface is a group of similar methods with no bodies.
        Collection is an interface and Collections is a Class.
        Collections is an utiity class, utility class provides extra functionality. For example; Sorting, Solving etc. c
        Collection is an interface, where a group of different objects can be worked as one unit. Collection has and also defines
        several utility methods for collection object.

        Source: https://www.geeksforgeeks.org/collection-vs-collections-in-java-with-example/


   */



     }




    }
