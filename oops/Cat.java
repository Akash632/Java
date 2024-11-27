

public class Cat {
    public static Cat cat;

    private Cat(){
    }

    public static Cat getInstance(){

        if(cat == null){
            cat = new Cat();
        }
        return cat;
    }
}
