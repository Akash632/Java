public class Animal extends Zoo {
    public Animal(String name){
        super(name, "bow bow");
    }

    public String getName(){
        return getClass().getSimpleName();
    }

    public void wigTail(){
        System.out.println(getName() + "is wegging it's tail");
    }
}
