import java.util.*;
public class Search2DArray {
    public static void Search(int arr[][],int key) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]==key){
                    System.out.println(key+" is Found at"+"("+i+","+j+")");
                }
            }
        }
        System.out.println("Not Found!!");
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int row=sc.nextInt();
     int col=sc.nextInt();
     int array[][]=new int[row][col];
     
    //  Taking Input
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            array[i][j]=sc.nextInt();
        }
    }
    int searchElement=sc.nextInt();
    Search(array, searchElement);
    sc.close();
    }
}
