import java.util.*;
public class Print_SubArrays {
    public static void Print_SubArray(int arr[]){
        System.out.println("Possible SubArrays are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Print_SubArray(arr);
        sc.close();
    }
}
