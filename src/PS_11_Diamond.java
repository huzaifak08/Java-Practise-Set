public class PS_11_Diamond {
    static void diamondPattern() {
        // Upper part of Diamond:
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of Diamond:
        for (int i = 4; i >= 1; i--) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern();
    }
}
