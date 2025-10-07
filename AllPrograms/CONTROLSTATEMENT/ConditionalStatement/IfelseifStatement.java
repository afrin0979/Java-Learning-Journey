public class IfelseifStatement {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        int z = 8;

        if (x > y && x > z) {
            System.out.println("x is the greatest number");
        } 
        else if (y > x && y > z) {
            System.out.println("y is the greatest number");
        } 
        else {
            System.out.println("z is the greatest number");
        }
    }
}
// “An if-else-if statement is used when we need to check multiple conditions.
//  It tests each condition one by one — when one condition is true, 
//  its block of code runs, and the rest are skipped.”