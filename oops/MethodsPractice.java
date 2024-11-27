public class MethodsPractice{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,56};

        // int result = CalculateSum(nums);
        // System.out.println(result);

        // Cat c = new Cat();
        // c.name = "meow";
        // ChangeName(c);
        // System.out.println(c.name); 

        // printNums(1,2,4,5,6);

        System.out.println(args[0]);
    }

    public static void ChangeName(Cat c){
        c.name = "puppy";
    }

    public static void printNums(int ...a){
        for(int i : a){
            System.out.println(i);
        }
    }

    public static int CalculateSum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
}