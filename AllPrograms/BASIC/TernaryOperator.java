public class TernaryOperator {
    public static void main(String[] args) {
        char letter = 'h';
        char letter2 = 'h';
        String result = (letter == letter2) ? "same value" : "wrong value";
        System.out.println(result);


        int a=5;
    String result2;
        result2= a>20? "a is bigger than 20": "b is bigger than 20";
        System.out.println(result2);


        int b=5;
    int result3;
        result3= b>20? 0: 1;
        System.out.println(result3);


    }
}

//“The ternary operator is a shorthand form of the if-else statement that returns a value based on a condition.”