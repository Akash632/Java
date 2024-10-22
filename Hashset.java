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
        boolean duplicate = players.add("Ashok");
        System.out.println(players);
        System.out.println(isAdded);  //prints true,  because Ashok is not added.
        System.out.println(duplicate);  //prints false, because Ashok is already present.


        //remove method is used to remove the elements. It returns true, if hashSet contains the specified element else returns false.
        boolean isRemoved = players.remove("Aakash");

        System.out.println(isRemoved);  //false because Aakash is not present.

        //players.clear();  //removes all elements.

        //System.out.println(players);  //prints an empty HashSet.

        //contains method is used to check if hashSet contains the specified element.

        //returns true if the element is present else returns false.

        boolean doContain = players.contains("Akash");

        System.out.println(doContain);  //true

        System.out.println(players.size());  //2


        //we use forEach to iterate over a hashSet

        for(String name : players){
            System.out.println(name);
        }
        
    }
}
