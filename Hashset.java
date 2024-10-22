import java.util.*;

public class Hashset {
    public static void main(String[] args){
        
        //Arrays and arrayList can store duplicate eleements, whereas hashset always store unique elements.

        //like arrayList, hashset also can only store objects like string, Integer etc, we need to use wrapper class.

        HashSet<String> players = new HashSet<>();

        //to add elements we use add method.

        //while adding, if we try to add element which is not present, it adds the element and return true, else
        //the set remains unchanged and return false.

        players.add("Akash");

        boolean isAdded = players.add("Ashok");
        // boolean duplicate = players.add("Ashok");
        // System.out.println(players);
        // System.out.println(isAdded);  //prints true,  because Ashok is not added.
        // System.out.println(duplicate);  //prints false, because Ashok is already present.


        //remove method is used to remove the elements. It returns true, if hashSet contains the specified element else returns false.
        // boolean isRemoved = players.remove("Aakash");

        // System.out.println(isRemoved);  //false because Aakash is not present.

        //players.clear();  //removes all elements.

        //System.out.println(players);  //prints an empty HashSet.

        //contains method is used to check if hashSet contains the specified element.

        //returns true if the element is present else returns false.

        // boolean doContain = players.contains("Akash");

        // System.out.println(doContain);  //true

        // System.out.println(players.size());  //2


        //we use forEach to iterate over a hashSet

        // for(String name : players){
        //     System.out.println(name);
        // }

        players.add("Sai");
        players.add("Bappa");
        players.add("madhav");

        System.out.println(players);

        HashSet<String> names = new HashSet<>();

        // names.add("Sourab");
        // names.add("Nehal");
        names.add("Akash");

        //to union to hashsets we use addAll

        //players.addAll(names);  //union = hashSet1 + hashSet2

        //System.out.println(players);

        //addAll method mutates and adds all the unique elements from names to players

        //to intersect hashSets we use retainAll  
        //intersection = adding only the common elements.


        //players.retainAll(names);

        //Here, the retainAll() method retains all the elements that are common in hset1 and hset2 and removes all the other elements from the hset1

        //System.out.println(players);  //[Akash]

        //removeAll methods removes all the common elements from hash1 and hash2, and returns the remaining elements in hash1.

        //players.removeAll(names);

        //System.out.println(players);  //returns all the unique elements

        //contains All method is used to check whether a set is subset or superset of others.

        boolean isSuperset = names.containsAll(players);
        boolean isSubset = players.containsAll(names);
        System.out.println(isSubset); //true
        System.out.println(isSuperset);  //false

        //  Since hashSet is an unordered list, we cannot perform operations like sorting.
        // so to perform these operations, we first convert it into a ArrayList.

        // ArrayList<String> values = new ArrayList<>(players);

        // System.out.println(values);


    }
}
