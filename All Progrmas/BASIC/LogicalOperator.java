public class LogicalOperator{
    public static void main(String[] args) {
        int x=7;
        int y=5;
        int a=5;
        int b=9;
        //boolean result =x>y &&a>b;//false
    boolean result =x>y &&b>a;//true
    boolean result2= x>y || a>b||a>1;
    boolean result3=a>x;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(!result3);
    }
}