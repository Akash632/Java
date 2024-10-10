
public class Strings {
    public static void main(String[] args){

        String s1 = "Akash ";

        String s2 = "Nagineni";

        // System.out.println(s1+s2);  //concatination

        // System.out.println(s1.concat(s2));  //concatination

        // System.out.println(s2.length());  //for getting the length of a string

        // System.out.println(s1.charAt(0));  //to get specific character. If we write index out of boundary, then we get out of  
        
        // //boundary error

        // System.out.println(s1.substring(0, 3));  //substring

        // //if ending index is not provided, then from starting till beginning are considered.

        // System.out.println(s1.repeat(3)); // prints the string 3 times

        // System.out.println(s1.trim()); //removes leading and trailing white spaces.

        // System.out.println(s1.toLowerCase());  //to lower case

        // System.out.println(s2.toUpperCase());  //to upper case

        // System.out.println(s1.replace("a", "x")); //replace all the occurances of a

        // System.out.println(s2.replaceFirst("n", "b")); //replaces the first occurance of n

        //String comparisonm= methods. - we cannot compare strings normally like =, ==

        // Relational operators works same on numbers, characters but not on strings

        //String formators

        //format specifiers

        //%d - integers , %s or S - string, %b or B - boolean, %c or %C - char, %f - float, 

        // String sentance = "My full name is %s %s";

        // System.out.println(String.format(sentance, s1, s2));

        // float a = 2.4566f;

        // String b = "%.2f";  //upto 2 decimal places

        // System.out.println(String.format(b,a));

        //Printf - rather than formating separetely we can directly, format it during the print statement.

        // String sent = "My full name is %s%s";

        // System.out.printf(sent,s1,s2);

        // Strings and Arrays

        // String name = "Akash Nagineni";

        // String[] values = name.split(" ");  //works in the same way as JS

        // System.out.println(Arrays.toString(values));

       // The join() method joins the given elements with the specified delimiter and returns a new string.

       //String.join(delimiter, str1, str2, str3, ...);

        // String delimeter = "-";

        // String pre = "is";

        // String gender = "male";


       // System.out.println(String.join(delimeter, name, pre, gender)); //Akash Nagineni-is-male

       //String[] names = {"Akash","Ashok","Anant"};

       //System.out.println(String.join("-", names));  //returns a new string with "-"

       // We can use the same method to join arrays.

       //same works for arrayList as well.




    } 
}
