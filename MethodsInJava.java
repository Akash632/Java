import java.util.*;
public class MethodsInJava {

    // static void greet(){
    //     System.out.println("Hello");
    // }

    static int addition(int a, int b){
        Scanner sc = new Scanner(System.in);

        sc.close();

        return a+b;

    }

    static int addition(int a, int b, int c){
        return a+b+c;
    }

    static double addition(double a, double b){
        Scanner sc = new Scanner(System.in);

        sc.close();

        return a+b;

    }

    static void twice(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*2;
        }
    }

    static void printName(String name){
        name = "Ashok";
        System.out.println(name);
    }
    public static void main(String[] args){


        //A method must be declared before it is used any where in the program.

        //accessModifier static returnType methodName(){}

        //static methods in java can be called even without creating objects of the class.

        //accessModifiers are used to spcify the accessibility of the method. public, private, default or protected.

        //calling a method

        //greet();

        // int result = addition();
        // System.out.println(result);

        //we can create methods with parameters as well.

        //accessmodifiers static returnType methodName(dataType value, dataType value, ......){}


        // printName("AKASH");


        //method arguments are nothing but the parameters we pass to the method when it is called.
        //1.positional arguments - regular arguments
        //2.variable length arguments - vargars (dataType... name)
        //3.pass by value - for primary datatypes - value is copied and for objects refernce is copied.
        //if a primitve value is updated in class, the change is not visible outside the class
        //for derived class, the change will be visible
        //4.Default arguments - java directly doesn't support default arguments. But we can achieve it using method overloading.



        //method overloading  - If a class has multiple methods with same name, but different parameters
        // we can acheive method overloading in 2 ways - 1. By changing the data type of the parameter, 2. By changing the number of parameters

        int result = addition(2,3);   //methods with same name but different parameters
        double result2 = addition(13.1,52.54);  //methods with same name but different parameters
        int result3 = addition(2,3,4);  //methods with same name but different number of parameters
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        //If there are different return types and the same method name with the same number of parameters and the same 
        //type of parameters, the method will not be overloaded

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        twice(nums);
        System.out.println(Arrays.toString(nums));

        //passing immutable objects- changes done inside the method are not reflected out of the method.

        String name = "Ashok";
        System.out.println(name);
        printName(name);
        System.out.println(name);


        //Recusrion - method calls itself inside the execution
        //recursive method terminates, when the base condition is reached.

        //Math functions
        int a = 10;
        int b = 20;
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.abs(-2));  //returns the absolute value, if the given no is positive, it return same num;
        
    }
}
