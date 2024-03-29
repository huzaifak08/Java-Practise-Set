public class PS_12_MirroredTriangle {
    static void mirroredTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * 4) - (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // *******
        //  *****
        //   ***
        //    *

        mirroredTriangle();
    }
}
