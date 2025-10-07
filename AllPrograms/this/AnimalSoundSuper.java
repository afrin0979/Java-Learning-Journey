class Animal{
    void sound(){
        System.out.println("Animal makes sound ");
    }
}
class Dog extends Animal{
     void suond(){
        super.sound();
        System.out.println("Dog barks");

    }
}


public class AnimalSoundSuper {
    public static void main(String[] args) {
    Dog d=new Dog();
    d.suond();
    
    }
    
}
