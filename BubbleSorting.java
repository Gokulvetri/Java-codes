public class BubbleSorting {
    static void bubblesort(int[]arr){
        int n = arr.length;
        for (int i = 0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
       

        int arr[] = {6,9,8,5,4,7,1};
        bubblesort(arr);
    }
}
