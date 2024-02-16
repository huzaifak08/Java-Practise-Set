import java.util.ArrayList;
import java.util.Scanner;

public class CustomArrays {

    public static void main(String[] args) {
        
        System.out.print("How many Numbers you want to Enter? ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter " + i + "th Number: ");
            int temp = sc.nextInt();
            arr.add(temp);
        }

        System.out.println(arr);

    }

}
