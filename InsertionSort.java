class InsertionSort{
    public static void PrintArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void Insertion_Sort(int arr[]){
        int j;
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args){
        int arr[]={7,8,3,2,1};
        System.out.print("Before sorting: ");
        PrintArray(arr);
        Insertion_Sort(arr);
        System.out.print("\nAfter sorting: ");
        PrintArray(arr);
    }
}