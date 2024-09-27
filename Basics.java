import java.util.Scanner;

public class Basics {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // int a = sc.nextInt();

        // System.out.println(name);

        // System.out.println(a);

        // int size = sc.nextInt();

        // int[] nums = new int[size];

        // for(int i=0; i<size; i++){
        //     nums[i] = sc.nextInt();
        // }

        // for(int num : nums){
        //     System.out.println(num);
        // }


        //type conversion

        // double x = 5.6;

        // int y = (int) x;

        // System.out.println(y);  //explicit type conversion from double to int.

        // float a = 12.5f;

        // short z = (short) a;
        
        // System.out.println(z);

        // //for converting char into int the ASCII values are considered

        // char letter = 'A';

        // int b = (int) letter;

        //char a = sc.next().charAt(0);  //reading a char, as char doesn't have specific method to read the input.

        // System.out.println(b);  //vice versa can also be done.


        // char x = 'a';

        // float y = x;
        
        // System.out.println(y);   //implicit


        //methods for conversion 

        //int => string

        int a = 123;

        String b = String.valueOf(a);  //any data type can be converted into string using this method.

        String z = Integer.toString(a);

        System.out.println(b);

        System.out.println(b.getClass().getSimpleName());  //checking the type of variable 

        //this is callable by objects only. So non-primitive types only works

        //for primitive - we can convert it into an object and check.

        System.out.println(((Object)a).getClass().getSimpleName());   // using Object keyword, we can convert primtive into an object.

        //once we are done with scanning we close the scanner

        sc.close();
    }
}
