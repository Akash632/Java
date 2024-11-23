
import java.util.LinkedList;


public class Linked_lists {
    public static void main(String[] args){
        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        System.out.println(ll1);

        System.out.println(ll1.get(1));

        ll1.addFirst(20);
        ll1.addLast(15);
        System.out.println(ll1.getFirst());
        ll1.getLast();
        System.out.println(ll1);
    }
    
}
