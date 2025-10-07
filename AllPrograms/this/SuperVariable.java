class Animal{
    String name="Lion";

}
class dog extends Animal{
    String name="CAt";
    void displayInfo(){
        System.out.println("Animal name: "+super.name);//different class
        System.out.println("Dog name: "+ this.name);// sa,me class

    }
}
public class SuperVariable{
    public static void main(String[]args){
        dog d= new dog();
        d.displayInfo();

    }


}
//variableName → refers to child class variable.

//super.variableName → refers to parent class variable.