import java.util.*;

public class Pairs_in_an_Array {
    public static void PrintPairs(int arr[]) {
        System.out.println("Pairs are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(",(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        PrintPairs(arr);
        sc.close();
    }
}