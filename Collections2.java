import java.util.ArrayList;

public class Collections2 {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(20);
        nums.add(50);

        // for(int i=0; i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }
        
        // for(int i : nums){
        //     System.out.println(i);
        // }

        nums.add(1, 30);
        System.out.println(nums);

        nums.set(1,50);
        System.err.println(nums);


    }
}
