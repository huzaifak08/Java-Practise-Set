public class Main {

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    static int addition(int n) {
        if (n == 0) {
            return 0;
        } else
            return n + addition(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        // ForEach Loop:
        int[] arr = {12, 23, 4, 3, 2, 1};

        for (int i : arr) {
            System.out.println(i);
        }

        // Multidimensional Array:
        int[][] arr2 = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}};
        System.out.println(arr2[1][2]);

        // Recursion:
        int num = 5;
        int factorial = calculateFactorial(num);
        System.out.println(factorial);

        int add = addition(num);
        System.out.println(add);

        // Getter and Setters:
        GetterSetter gs = new GetterSetter();
        gs.setX(23);
        int x = gs.getX();
        System.out.println(x);

    }
}