public class RecursiveQuickSort{
    public static void sort(int[] arr , int l ,int h){
        if(l<h){
            int pi = partition(arr , l ,h);

            sort(arr,l,pi-1);
            sort(arr,pi+1,h);
        }
    }
    private static int partition(int[] arr,int l,int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j = l  ; j<h ;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]= arr[h];
        arr[h] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,6,5,7,4,2,1,3};
        sort(arr,0,arr.length-1);

        for (int num : arr) {
            System.out.print(num + " ");

        }
    }
}