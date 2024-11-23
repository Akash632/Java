import java.util.ArrayList;
import java.util.Collections;

public class Collections2 {
    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(60);
        nums.add(50);

        // for(int i=0; i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }
        
        // for(int i : nums){
        //     System.out.println(i);
        // }

        // nums.add(1, 30);
        // System.out.println(nums);

        // nums.set(1,50);
        // System.err.println(nums);

       // System.out.println(nums.getClass().getSimpleName());

        //String[] arr = {"akash", "ashok"};

       // ArrayList<String> nums1 = Arrays.asList(arr);

       //ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));

       //nums.toArray();

       //System.err.println(nums);

       Collections.sort(nums);

       System.out.println(nums);


    }
}
