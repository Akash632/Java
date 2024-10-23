import java.util.*;

public class Hashmaps {
    public static void main(String[] args){

        //hashmap is also an unordered collection in java.It stores information in the form of key value pairs.
        //key should be unique and the value should be mapped with key.
        //hashmap can have duplicates.

        //Simialr to ArrayList, hashSets, Hashmap can only store objects like String, Integer

        //HashMap<Key(data type), value(data type)> hmap = new HashMap<>();

        HashMap<String, Integer> data = new HashMap<>();

        //we use put method to add elements in Hashmap

        //data.put(key,value)

        data.put("Akash", 21);
        data.put("James", 121);
        data.put("Antony", 136);
        data.put("John", 78);

        System.out.println(data);

        //to access the elements we use get method.

        System.out.println(data.get("Akash"));

        //to modify the elements, we have 2 ways. one is replace() and other is put()

        //replace() replaces the old value with the new value and returns the old value 
        //if no key is present it returns null.
;
        System.out.println(data.replace("Akash", 25));
        System.out.println(data);

        //put() method is also used to replace the old value with the new value and returns the old value, 
        //if value is not present, it will add the key value and returns null.

        System.out.println(data.put("Ajay",20));
        System.out.println(data);


        //to remove elements we have remove and clear

        //If the HashMap contains the specified key, 
        //remove()  will remove the element and returns the value mapped to the specified key. Otherwise, null is returned.

        System.out.println(data.remove("Akash"));
        System.out.println(data);

        //clear removes all the elements from hashmap and makes it empty.

        // data.clear();
        // System.out.println(data);

        //keySet() is used to get all the keys from a hashmap

        System.out.println(data.keySet());  //returns a set which is an interface

        //values() is used to get all the values from a hashmap

        System.out.println(data.values());  //returns a set which is an interface

        //Entryset is used to get all the entries

        System.out.println(data.entrySet());   //returns a set which is an interface

        //we use forEach loop to iterate over a hashmap

        for(String key : data.keySet()){
            System.out.println(key + ":" + data.get(key));
        }

        //We can also iterate using entrySet, because when we use entrySet we get a collection of elements. We can map
        //the elements and each element can be accessed using Map.Entry.

        for(Map.Entry<String, Integer> entry: data.entrySet()){
            System.out.println(entry);
        }
    }  
}
