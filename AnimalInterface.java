interface Animal{
    void Bark();
}
class Dog implements Animal{
    public void Bark(){
        System.out.println("Dog Is Barking");
    }
}

public class AnimalInterface {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        d1.Bark();
    }
    
}
