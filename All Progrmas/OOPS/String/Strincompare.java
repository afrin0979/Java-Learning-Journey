
import java.util.Scanner;

public class Strincompare{
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
String word1="Afrin";
String word2="Afrin";
if(word1.compareTo(word2)==0){
    System.out.println("this are equals");

}else{
    System.out.println("not equals");
}
    System.out.println("next");


    //why we not using == symbols to compare.because some time it fails text case
    if(new String("Afrin")==new  String("Afrin")){
        System.out.println(" Afrin string are equls");
    }else{
        System.out.println("String are not equals");
    }
    //look in second if statement here the same word which are taken in another that compareto statement give currect answer 
    //but == this give wrong so we have to use that compareto methode to avoiding the error.


    }
}