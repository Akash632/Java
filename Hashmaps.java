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
    }  
}
