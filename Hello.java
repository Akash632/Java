class Rectangle{
    int height;
    int width;

    Rectangle(int height, int width){  //this is constructor method and the name of constructor should be same as class name.
        this.height = height;
        this.width = width;
    }

    //for methods we use return type followed by method name and arguments passing for them

    String getName(){
        return "Akash Nagineni";
    }

    int findArea(){
        return this.height * this.width;
    }

    //no return type = void as we know
   }

public class Hello{
    public static void main(String[] args){
        
        // String name = "Akash";
        // int a = 10;
        // int age = 21;

        // double price = 25.25;

        // age = 100;  // we can update the values as usual.

        // int num1 = 1;
        // int num2 = 2;

        // int result = num1 + num2;
        // //System.out.println(result);

        // int multiply = num1 * num2;

        // System.out.println(multiply);

        //double height = 5.6;  //by defualt decimal points are treated as double data type.

        //to define float we add suffix f to the value 5.6f

        //char a = 'A'; //char data type is used for storing single char with single quotes

        //string will be enclosed in double quotes

        // int num1 = 10;
        // int num2 = 2;

        // System.out.println(num1+num2); //addition
        // System.out.println(num1 - num2); //subraction
        // System.out.println(num1 * num2); //multiplication
        // System.out.println(num1/num2); //division, which returns quotient
        // System.out.println(num1%num2); //modulus, which returns remainder 

        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();

        // int age = sc.nextInt();

        // if (age>20){
        //     System.out.println("Hello world!!!");
        // }else{
        //     System.out.println("Hello  not world");
        // }


        // final int NUM_1 = 21;
 
       // a=22;  //error because var with final keyword cannot be reassignned


       //declaring classses

       //creating the new instance

       //we use the same name of the class

    //    Rectangle rec = new Rectangle(10, 20);
    //    System.out.println(rec.height);
    //    System.out.println(rec.width);

    //    String a  = rec.getName();   //calling the method
    //    System.out.println(a);

    //    int area = rec.findArea();
    //    System.out.println(area);


    //for arrays all the elements in the array should be of same data type

    // int nums[] = {1,2,3,4,5}; 

    //arrays are fixed in size.

    // for(int i =0; i<nums.length; i++){
    //     System.out.println(nums[i]);
    // }

    // for(int i : nums){
    //     System.out.println(i);
    // }

    //arrays can be initialized in other way as well

    int[] nums = new int[4];

    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    nums[3] = 4;

    for(int i : nums){
        System.out.println(i);
    }    
}
}