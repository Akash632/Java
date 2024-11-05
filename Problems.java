import java.util.*;

public class Problems {

    // static int findIndex(int num, int[] arr){
    //     for(int i=0; i<arr.length; i++){
    //         if(num == arr[i]){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
    public static void main(String[] args){
        /*
        * Write a Java program that takes two user input integers m and n and prints the multiplication table from 1 to n for the 
        * number m. The program should use nested for loops to generate the table.
        * 
        * Sample Input:
        * --------------------
        * 3 5
        * 
        * Sample Output:
        * --------------------
        *   3 x 1 = 3
            3 x 2 = 6
            3 x 3 = 9
            3 x 4 = 12
            3 x 5 = 15

        * Explanation:
        --------------------
        The input integers are m=3 and n=5. The program generates the multiplication table for 3 from 1 to 5. 
        */

        Scanner sc = new Scanner(System.in);


        // int m = sc.nextInt();
        // int n = sc.nextInt();

        // for(int i=1; i<=n; i++){
        //     System.out.println(m + " x " + i + " = " + m*i);
        // }

        /* Count number of even digit in a number
        * If the count greater than or equal to 3, then print "True" otherwise "False"
        */

        // int m = sc.nextInt();

        // int count = 0;
        
        // while(m!=0){
        //     int digit = m%10;
        //     if(digit%2==0){
        //         count++;
        //     }
        //     m = m/10;
        // }

        // if(count>=3){
        //     System.out.println("True");
        // }else{
        //     System.out.println("False");
        //}

        /* Find occurance of a character in a string
            Input
            --------------
        *  Priyanka
        *  a
        
        *  Output
            ----------------
        *  2
        */

        // String word = sc.nextLine();
        // String lowercase = word.toLowerCase();
        // char letter = sc.next().charAt(0);
        // char newChar = Character.toLowerCase(letter);
        // int count = 0;

        // System.out.println(lowercase);
        // System.out.println(newChar);

        // for(int i=0; i<lowercase.length(); i++){
        //     if(lowercase.charAt(i) == newChar){
        //         count++;
        //     }
        // }

        // System.out.println(count);

        /* Find average of a number array between two limit numbers (except the two numbers)
        * Input
        * ---------------
        *  5
           1 
           2
           3
           4
           5
        *  1
        *  4
        * 
        * Output
        * ---------------
        * 2
        */

        // int num = sc.nextInt();
        // int[] arr = new int[num];

        // for(int i=0; i<num; i++){
        //     arr[i] = sc.nextInt();
        // }

        // int m = sc.nextInt();
        // int n = sc.nextInt();

        // int upperLimit = findIndex(m, arr);
        // int lowerLimit = findIndex(n, arr);

        // int sum=0;
        // int count = 0;
        // for(int i = upperLimit; i<=lowerLimit; i++){
        //     sum+=arr[i];
        //     count++;
        // }

        // System.out.println(sum);
        // System.out.println(count);

        
    }
}
