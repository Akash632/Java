class Mobile{
    String model;
    String camera;  

    Mobile(String model, String camera){  //constructor function
        this.model = model;
        this.camera = camera;  //this keyword is used to refer to the current instance variable.
    }

    //instance method
    void MakeCall(long ph){
        System.out.println("Calling to "+ph);
    }
}

class Person{
    static String name = "Ashok";  //class attributes
    static String gender = "Male";

    static void printName(){  //class methods
        System.out.println("Name is "+name);  //we don't require this keyword in class methods
    }
}

//inheritance - parent class
class Product{
    String name;
    int price;
    float rating;

    Product(String name, int price, float rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    void displayProduct(){
        System.out.println("Product is "+this.name+" having "+this.price+" with rating"+this.rating);
    }
}

// class Car{
//     String model; //instance attributes
//     int price; //instance attributes

//     Car(String model, int price){
//         this.model = model;
//         this.price = price;
//     }
//     void displayModel(){   //instance method.
//         System.out.println("Model is "+this.model);
//     }
// }

class Car{
    String model; //instance attributes
    int price; //instance attributes
    static int wheels = 4; //class attribute, this will be same for all instances.

    Car(String model, int price){
        this.model = model;
        this.price = price;
    }

    Car(){  //overloading constructor
        System.out.println("Car class");
    }
    void displayModel(){   //instance method.
        System.out.println("Model is "+this.model);
    }

    static void displayWheels(){  //class method, because we are using this for accessing class attributes only.
        System.out.println(wheels);  //we don't use this for class methdods and attributes
    }
}

class Items extends Product{
    Items(String name, int price, float rating){   //constructor function for items class
        super(name, price, rating);           //super class
    }

    void getExpiry(){
        System.out.println("Expiry date");
    }

    void displayProduct(){
        System.out.println("Method got overided");
    }
}



public class Oops {
    public static void main(String[] args) {
        System.out.println("OOPS CONCEPTS");

        //Class is nothing but a bundle of properties and actions (methods).

        //Mobile is a class in real life, where colour and features are properties and calling, playing music are methods.

        //Java have 1. instance attributes/methods and class attributes/Methods. We differentiate them with static keyword

        //class is a blueprint to create a call and instance is an object created from that class

        //Java has instance attributes and methods, class attributes and methods.

        //instance attributes  - variables unique to each class
        //instance methods - functions which are use or modify instance attributes.


        // in java we declare them inside a classs.

        //instance variables can be initialized in multiple ways. we can use a constructor to initialize the instance variables.
        //In the above car class, we can see intance attributes, because each car can have unique name and price
        // And we can see instance method, because it operates on instance attributes.


        //class attributes - Shared attributes accross all the instance of the classes.
        //class methods - operates on class attributes and don't require any specific data.
        //class attributes and methods are defined with static keyword.
        // above Car class example


        //Constructor methods are the special methods which are invoked, everytime we create an instance.

        //-When don't write a constructor function, java will bydefault creates and calls a constructor function, during runtime.
        //-We don't use static, final or abstract keywords for constructors,
        //-We can have empty parameter constructors, as well as method overloading constructors(when a constructor have same name, but different parameters).
        //-During object creation, constructors are called explictly.

        //We can even avoid using this key word and directly write model = model,
        //but to differentiate betweem class and instance attributes, to remove confusion and to increase the
        //code readability, we use this keyword

        //we can also pass this as an argument to an instance/non-static method.

        //instance of a class is created using new keyword

        //we can update the attributes of a class as well

        Car c = new Car("maruthi", 25000);
        System.out.println(c.model);
        c.model="BMW";
        System.out.println(c.model);


        //The class from which the object is created is called the type of the object;
        System.out.println(c.getClass().getSimpleName());  //Car

        //calling the instance
        // Mobile m = new Mobile("iphone 14", "13mpx");

        // System.out.println(m.model);
        // System.out.println(m.camera);
        // m.MakeCall(9052777);

        //class attributes/methods are created using static key word

        //System.out.println(Person.name);

        //accessing class attributes using objects

        // Person p = new Person();
        // System.out.println(p.name);
        // p.printName();  //class method


        //inheritance - inheriting properties from class attributes. We use extends to inherit properties.
        // for this we initialize a superclass in the subclass to get all the properties from the parent class
        // Items i = new Items("mobile", 5000, 2.5f);
        // i.displayProduct();
        // i.getExpiry();


        //we can do method overriding as well. Methodoveriding in java is using the same method name, parameters and return type of
        //another method.


        //A class that contains main method must have lexicographically smaller class name

    }
}
