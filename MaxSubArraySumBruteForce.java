import java.util.*;
public class MaxSubArraySumBruteForce{
    public static void MaxSubArraySum(int arr[]){
        int maxi=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" Sum: "+arr[i]);
            for(int j=i+1;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    currSum+=arr[k];
                }
                System.out.print("Sum: "+currSum);
                System.out.println();
                if (maxi<currSum){
                    maxi=currSum;
                }
            }
            System.out.println();
        }
        System.out.print("Maximum Sum: "+maxi);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        MaxSubArraySum(arr);
        sc.close();
    }
}
