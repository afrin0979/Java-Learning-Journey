class Animal{
    void sound(){
        System.out.println("Animal makes sound ");
    }
}
class Dog extends Animal{
     void sound(){
        super.sound();
        System.out.println("Dog barks");

    }
}
99000
public class overrideSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
