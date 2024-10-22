

public class ArraysIntro {
    public static void main(String[] args) {

        //Arrays are used to store the data of same data type.

        //int[] arr;  //array declaration

        //This declaration doen't creates and array, it simple tells the compiler that the variable will hold an array.

        //we can intialize, declare and create an array in the same line.

        //int[] nums = {1,2,3,4,5}; //these elements creates the array an object and the reference of this array is assigned to nums.

        //we can access array elements using indexes.

        //Array provides a method toString[] to display at a time.

         int[] nums = {1,2,3,4,5};

        // System.out.println(Arrays.toString(nums));  //method to print arrays.

        //we can also modify arrays using the index notation.

        //we can create an array using new key word as well.

        //int[] arr = new int[3];  //creating an array using new key word

        //In the above code, this will allocate memory for 3 int values. Once the memory is allocated, it will assign value 0,

        //incase of byte, short, int, long. For float and double it will 0.0 and for string it will be null.

        //int size = arr.length;  //gives the size of the array.

        // for(int i =0; i<nums.length; i++){    looping on array using for loop
        //     System.out.println(nums[i]); 
        // }

        // for (int i : nums) {                   looping on array using for each.
        //     System.out.println(i);
        // }

        //Array concatination

        //In java, system class provides array concatination method to concat arrays.

        //System.arraycopy(array1, array1StartPosition, array2, array2StartPosition, noof elements);
        // int[] arr1 = {1,2,3};
        // int[] arr2 = {4,5,6};

        // int[] result = new int[arr1.length + arr2.length];

        // System.arraycopy(arr1,0,result,0,3);

        // System.out.println(Arrays.toString(result));

        // System.arraycopy(arr2, 0, result, 3,3);

        // System.out.println(Arrays.toString(result));

        //Array slicing = Arrays.copyOfRange(array, startIndex, endIndex);

        // int[] arr1 = {1,2,3,4,5};

        // int[] copyArr = Arrays.copyOfRange(arr1, 0, 3);

        // System.out.println(Arrays.toString(copyArr));


        //multidimensional arrays.

        // We can create N Dimensional arrays like 2D, 3D etc.

        //A two dimensional array is a collection of 1d arrays.

        // {
        //     {12, 24, 36},    rows- noof 1d arrays - 3
        //     {15, 30, 45},    columns- noof elements in each 1d array - 3
        //     {16, 32, 48}      So, total noof elements = 3*3 = 9;
        // }

        // here first will have index 0 and each element will have normal index from 0 to 1.

        // int[][] arr1 = {{1,2,3},{4,5,6}};

        //int[][] arr = new int[3][3];

        //for printing 2d array we use deep string method 

        // System.out.println(Arrays.deepToString(arr1));

        // for(int i =0; i<arr1.length; i++){
        //     for(int j =0; j<arr1[i].length; j++){
        //         System.out.println(arr1[i][j]);
        //     }
        // }

        //transposing the matrix;
        // int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

        // for(int i=0; i<arr1.length; i++){
        //     for(int j=i+1; j<arr1[i].length; j++){
        //         int temp = arr1[i][j];
        //         arr1[i][j] = arr1[j][i];
        //         arr1[j][i] = temp;
        //     }
        // }

        // System.out.println(Arrays.deepToString(arr1));

        //This transpose logic works only for sqaure matrix and in-place transponse. 

        //We can make a in-place transpose, if it is not a square matrix.

        //sorting arrays

        // Integer[] arr = {5,2,10,9,12,1};

        // Arrays.sort(arr);  //ascending order.

        // System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr, Collections.reverseOrder());  //descending order.

        // System.out.println(Arrays.toString(arr));

        //for using collections, we need to use Integer.

        //Reversing strings

        //To reverse strings, we convert string into char array and then we loop and join in reverse order.

        //to get characterArray from string we use toCharArray().

        // String name = "Akash";

        // char[] nameArray = name.toCharArray();

        // String reverse = "";

        // for(int i = name.length()-1; i>=0; i--){
        //     reverse += nameArray[i];
        // }

        // System.out.println(reverse);  //reversing a word

        //Reversing arrays -  we can either loop or use Collection.reverse();

        // Integer[] arr = {1,2,3,4,5,6,7,8,9,10,10};

        // ArrayList<Integer> newArr = new ArrayList<>(Arrays.asList(arr));

        // Collections.reverse(newArr);

        // System.out.println(newArr);  //reversing

        


    }   
}
