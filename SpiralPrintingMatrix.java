import java.util.*;
public class SpiralPrintingMatrix {
    public static void PrintSpiral(int arr[][]){
        int startRow=0;
        int endRow=arr.length-1;
        int startCol=0;
        int endCol=arr[0].length-1;

        // Printing matrix in Spiral manner
        while(startRow<=endRow && startCol<=endCol){

            //Top
            // Printing Top Part of Matrix --> Fixed-- startRow, var-- startCol
            // j for column & j for row
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            // Right
            // Printing right Part of the matrix--> fixed-- startCol, var-- startRow
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }  

            //Bottom
            // Printing bottom part of the matrix--> fixed-- endRow, var-- endCol
            for(int j=endCol-1;j>=startCol;j--){
                if (startRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //Left
            // Printing left Part of the matrix--> fixed-- startCol, var-- endRow
            for(int i=endRow-1;i>=startRow+1;i--){
                if (startCol==endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row: ");
        int row=sc.nextInt();
        System.out.println("Enter Col: ");
        int col=sc.nextInt();

        int matrix[][]=new int[row][col];
        System.out.print("Enter Elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        PrintSpiral(matrix);

        sc.close();
    }
}
