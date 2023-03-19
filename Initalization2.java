public class Initalization2 {
    public static void main(String[] args) {
        int arr[][]=new int[2][3];
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        arr[0][0]=80;
        // arr[0][1]=2;
        // arr[0][2]=10;
        arr[1][0]=6;
        arr[1][1]=90;
        arr[1][2]=0;
    
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}
