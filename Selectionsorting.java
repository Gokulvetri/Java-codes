public class Selectionsorting {
    static void sort(int[]arr){
        int n = arr.length;
        for (int i= 0; i< n-1;i++){
            int min = i;
            for (int j = i+1;j < n;j ++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int num : arr){
            System.out.print(num +" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {6,4,2,8,9};
        sort(arr);
    }
}

