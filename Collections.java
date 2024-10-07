import java.util.*;

public class Collections{
    public static void main(String[] args){


        //ArrayList in java is nothing but a collection, which stores the elements of same data type
        //but the size of this can be changed as needed.

        //ArrayList<datatype> name = new ArrayList<>();

         ArrayList<String> names = new ArrayList<>();

        names.add(0, "Akash");  //repplace the element at the given index by moving all the elements ahead.   

        names.add("Ashok");  //adds the element at the end
        names.add("Alok");

        System.out.println(names.get(0)); //acessing the elements in arrayList.

        //set method is used to replace or modify the elements in arrayList

        names.set(1,"Alok");

        //names.remove(0); //removing elements from that corresponding index in arrayList;

        names.remove("Alok"); //removes the first occurance of the element given.
        
        System.out.println(names);

        //Autoboxing and unboxing.

        // int num = 5;

        // Integer num2= num;  //autoboxing - converting primitve type into corresponding wraper classes.

        // System.out.println(num2);

        // Boolean value = true;

        // boolean value2 = value; //unboxing - converting wrapper class into corresponding primitive types.

        // System.out.println(value2);

        //Adding integers to ArrayList.

        //ArrayList<int> values = new ArrayList<>();  //gives an error.

        //ArrayList can store only objects as the part of it. We cannot store primitive data types directly in ArrayList.

        //To store them we need to use wrapper class to convert them into objects first.

        //To convert primitive types.

        //byte => Byte
        //int => Integer
        //long => Long
        //short => Short
        //float => Float
        //double => Double
        //char => Character
        //boolean => Boolean

        // ArrayList<Integer> values = new ArrayList<>();

        // values.add(1);
        // values.add(2);
        // values.add(3);

        // System.out.println(values);
        // System.out.println(values.size());  //gives the size of the ArrayList.
        // values.clear(); //removes the array List elements
        // System.out.println(values);  


        //Hashset

        //Hashset is a datastruture in collections which stores the unique values. -no duplicates are allowed.

        //Hashet can store different datatypes elements.

        // HashSet<String> names = new HashSet<>();

        // names.add("Akash");

        // names.add("Akash");  //ignores this.

        // System.out.println(names);
        // System.out.println(names.size());  //gives the size of the set.


        //HashMaps

        //Hashmaps is a data structure, which stores data in key value pairs.

        //HashMap<Key(dataType), value(dataType)> data = new HashMap<>();

    //     HashMap<String, Integer> values = new HashMap<>();

    //     values.put("Akash",3);

    //     values.put("Ashok",2); //keys should be unique, if any key is repeated, then the latest given value is updated.

    //     System.out.println(values);
   }
}