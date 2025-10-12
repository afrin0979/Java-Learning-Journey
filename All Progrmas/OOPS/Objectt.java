class Calculator{
    int a;
    public int add(int n1,int n2){
        // System.out.println("in add");
        // return 0;
        int r=n1+n2;
        System.err.println("the sum");
        return r;
    }
}
public  class Objectt{
    public static void main(String[] args) {

        int num1=4;
        int num2=5;
        Calculator calc= new Calculator();
        int result =calc.add(num1,num2); //insted of  number using  7,8 i am directly calling the  num1 and num2 from main class 
        System.out.println(result);
        //A reference variable  calc is a variable that refers to (stores the address of) an object in memory.
        //It does not hold the actual object data, but instead points to where the object is stored.
        
    }
}
//So what we have done is we have created the class how to get a class that's very simple you say class and you mention the class name which is calculator and then in that class you can create variables
//  you can create methods this is how you specify what object knows right variables theta and what object does an object can add to values 
//  now how do we use this class basically you have to create an object of it so as you can

// Hey this is how you create the object you say hey you know JVMI want a new object you see you use a new keyword there and then jvm says 
// ok I will give you the object but also tell me design and this is how you mentioned design you say calculator now this will give you a new object of what type calculator
//  so you are assigning that to a variable called A new object of what type calculator so you're assigning that to a variable called calp of type calculator example when you say 5 that's an integer type that's why you say 8 now 2 this is an object of calculated type so you will assign that to Calp which is the Calvert
//   Thai variable now once you got the object reference here you can just use that reference and you can call the add method by passing two values return the value and print 