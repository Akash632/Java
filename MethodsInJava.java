import java.util.*;
public class MethodsInJava {

    // static void greet(){
    //     System.out.println("Hello");
    // }

    static int addition(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        return a+b;

    }

    static void printName(String name){
        System.out.println("Hello"+ " "+ name);
    }
    public static void main(String[] args){


        //A method must be declared before it is used any where in the program.

        //accessModifier static returnType methodName(){}

        //static methods in java can be called even without creating objects of the class.

        //accessModifiers are used to spcify the accessibility of the method. public, private, default or protected.

        //calling a method

        //greet();

        int result = addition();
        System.out.println(result);

        //we can create methods with parameters as well.

        //accessmodifiers static returnType methodName(dataType value, dataType value, ......){}


        printName("AKASH");
    }
}
