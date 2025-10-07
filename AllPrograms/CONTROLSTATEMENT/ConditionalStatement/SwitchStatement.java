

public class SwitchStatement{
    public static void main(String[] args) {
        
        // if(n==1)
        // System.out.println("Monday");
        // else if(n==2)
        // System.out.println("Tuesday");
        // else if(n==3)
        // System.out.println("Wenesday");
        // else if(n==4)
        // System.out.println("Tthursday");
        // else if(n==5)
        // System.out.println("Friday");
        // else if(n==6)
        // System.out.println("Saturday");
        // else
        // System.out.println("Sunday"); this is a bad way
    
        // Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        int n =5;
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendnesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday"); 
                break;
            default:
                System.out.println("Enter a valid Number");               
                   


        }


        //A switch statement in Java is a control statement that allows you to execute one block of code out of many options based on the value of an expression.
        //It’s an alternative to using multiple if-else statements, making the code cleaner and easier to read.

    }
}