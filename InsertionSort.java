public class InsertionSort {
    static void sort(int arr[]){
        int n = arr.length;
        for(int i= 1; i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > key){
               arr[j+1] = arr[j];
               j = j-1;
            }
            arr[j+1] = key;
        }
        for (int num : arr){
            System.out.print
            
            (num +" ");
        }
    }

    public static void main(String[] args) {
        int arr []= {6,5,3,4,2,1};
        sort(arr);
    }
}
