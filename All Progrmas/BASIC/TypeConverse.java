public class TypeConverse{
    public static void main(String[] args) {
        //Widening type casting
        int a = 5;
        double b= a;
        System.out.println(b);


        //narrowing typecasting
        double d = 2564.2548976;
   //     int c= d; wrong we can not do this 
              int c =(int)d;

              int f =12;
              byte k= (byte)f;
        System.err.println(k);
    }
}
