
import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name=sc.nextLine();
        System.out.println(name);
        //String it is a object beacuse it has botha data(proerties) and behavior(metodsn) so it s object.
        //some function are
         System.out.println(name.length());
        //if we want to change or  modife we cananot beacuse strings are immutable ,
        //if we want we have to create new string varaiable
        String upper=name.toUpperCase();
        System.out.println(upper);
    
        String lower=name.toLowerCase();
        System.out.println(lower);
         
        System.out.println(name.charAt(0));
        String word="java";
       
         
    }
}