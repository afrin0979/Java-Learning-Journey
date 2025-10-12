public class MultiDimensionalArray {
    public static void main(String[] args) {
        int num[][] = new int[3][5];

        num[0][0] = 10;
        num[0][1] = 20;
        num[0][2] = 30;
        num[0][3] = 40;
        num[0][4] = 50;

        num[1][0] = 60;
        num[1][1] = 70;
        num[1][2] = 80;
        num[1][3] = 90;
        num[1][4] = 100;

        num[2][0] = 110;
        num[2][1] = 120;
        num[2][2] = 130;
        num[2][3] = 140;
        num[2][4] = 150;

        // Print values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
