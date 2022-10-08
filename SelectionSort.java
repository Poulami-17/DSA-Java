class SelectionSort{
    public static void Selection_Sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[smallest])
                    smallest=j;
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
    }

    public static void PrintArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        int arr[]={7,8,3,2,1};
        Selection_Sort(arr);
        PrintArray(arr);
    }
}