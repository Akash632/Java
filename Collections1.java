import java.util.*;

public class Collections1{
    public static void main(String[] args){


        //ArrayList in java is nothing but a collection, which stores the elements of same data type
        //but the size of this can be changed as needed.

        //ArrayList<datatype> name = new ArrayList<>();

         ArrayList<String> names = new ArrayList<>();
         ArrayList<String> gender = new ArrayList<>();

        // names.add(0, "Akash");  //repplace the element at the given index by moving all the elements ahead.   

        names.add("Ashok");  //adds the element at the end
        names.add("Alok");

        gender.add("M");
        gender.add("F");

        // System.out.println(names.get(0)); //acessing the elements in arrayList.

        // //set method is used to replace or modify the elements in arrayList

        // names.set(1,"Alok");

        // //names.remove(0); //removing elements from that corresponding index in arrayList;

        // names.remove("Alok"); //removes the first occurance of the element given.
        
        // System.out.println(names);


        // names.addAll(gender); //concatenation - appends the second list to the end of the first list.

        // System.out.println(names);

        //subList method is used for arraySlicing.

        // ArrayList<String> name = new ArrayList<>(names.subList(0,1));  // end index is not included.

        // System.out.println(name);

        //Converting array to arrayList

        // String[] arr = {"Hello cutie"};

        // ArrayList<String> newList = new ArrayList<>(Arrays.asList(arr));

        // System.out.println(newList);

        // newList.toArray(arr);

        // System.out.println(arr);

        // System.out.println(names.indexOf("Akash"));

        //here this indexOf method compares the values of the each element in arrayList.
        //But we know that arrayList stores elements in the form of objects. So we have to convert the elements into objetcs.

        //for primitive types, this method compares the values, but for objects it compares the references
        
        // System.out.println(names.indexOf("Ashok"));

        //Collections.frequency(names, "Ashok");


        // ArrayList<Integer> numbers = new ArrayList<>();

        // numbers.add(1);
        // numbers.add(10);
        // numbers.add(5);
        // numbers.add(6);
        // numbers.add(3);

        // Collections.sort(numbers);

        // System.out.println(numbers); //by default ascending order

        // Collections.sort(numbers, Collections.reverseOrder());

        // System.out.println(numbers); //descending order

        ArrayList<String> persons = new ArrayList<>();

        //the sort method modifies the original array.

        //Autoboxing and unboxing.

        // int num = 5;

        //indexOf methods compares values, not the references.

        //if the element is not found, then it returns -1.

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



        // when we assign an arrayList to another arrayList, they both will be refering to the same arrayList.
        // So updating anyone will updates the others as well.

        // When arr1 and arr2 are referring to the same array and arr2 is assigned a new array, then arr2 refers to 
        // the new array and arr1 will be referring to the old array.

        //Updating immutable objects will not affect the values in an array, as the reference of the immutable object will be changed.

        //immutable here means, when we create a string with john, it creates a memory.
        //now when we update it, then it creates a new memory, but the memory of john is still present.
        //whereas arrays are mutable.

        // String name = "John"; 

        // String[] namesArr = {name, "ashok"};

        // System.out.println(Arrays.toString(namesArr));

        // name = "James";

        // System.out.println(Arrays.toString(namesArr));

        //updating mutable objects will affect the elements in the array.

        // int[] val1 = {1,2,3,4,5};
        // int[] val2 = {6,7,8,9,10};

        // int[][] val3 = {val1, val2};

        // System.out.println(Arrays.deepToString(val3));

        // val1[0] = -10;
        // val2[1]= -100;

        // System.out.println(Arrays.deepToString(val3));


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