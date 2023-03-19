import java.util.*;
public class PrintLargest_Smallest{
    public static int Largest(int arr[][]) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (maxi<arr[i][j]){
                    maxi=arr[i][j];
                }
            }
        }
        return maxi;
    }
    public static int Smallest(int arr[][]) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (mini>arr[i][j]){
                    mini=arr[i][j];
                }
            }
        }
        return mini;
    }
    public static void PrintArray(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Number: ");
        int row=sc.nextInt();
        System.out.println("Enter Column Number: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];

        //Tahking Input
        System.out.println("Enter Elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        PrintArray(arr);
        System.out.println("Largest Element: "+Largest(arr));
        System.out.println("Smallest Element: "+Smallest(arr));
        sc.close();
    }
}