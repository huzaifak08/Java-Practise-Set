public class PS_17_ReverseTriangleHollow {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (i == 5 || j == 1 || j == (2 * i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
