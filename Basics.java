import java.util.Scanner;

public class Basics {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // int a = sc.nextInt();

        // System.out.println(name);

        // System.out.println(a);

        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        for(int num : nums){
            System.out.println(num);
        }




        //once we are done with scanning we close the scanner

        sc.close();
    }
}
