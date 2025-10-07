
class parent{
    void Displeparent(){
        System.out.println("I am the parent");
    }
}
class child extends parent{
    void displaychild(){
        super.Displeparent(); // calling parent method
        System.out.println("I am the child");
    }
}

public  class SuperMethode{
    public static void main(String[] args) {
        child c = new child();
        c.displaychild();
        
    }
}