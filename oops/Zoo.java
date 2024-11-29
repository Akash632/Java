public class Zoo {
    private String name;
    protected String sound;

    public Zoo(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name + " makes "+sound);
    }

    protected void changeSound(String sound){
        this.sound = sound;
    }

    public String getName(){
        return this.name;
    }
}
