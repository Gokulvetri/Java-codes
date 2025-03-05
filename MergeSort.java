public class MergeSort {
    public static void mergesort(int[] arr, int l, int r) {
        int mid = l + (r-l) / 2;
        if (l < r) {
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        System.arraycopy(arr,l,lArr,0,n1);
        System.arraycopy(arr,mid+1,rArr,0,n2);
        int i =0;
        int j =0;
        int k =l;
        while (i  < n1 && j <n2){
            if (lArr[i] <= rArr[j]){
                arr[k]= lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j <n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int [] arr ={3,5,8,7,6,1,2,4};
        mergesort(arr,0,arr.length-1);

        for (int num : arr){
            System.out.print(num +" ");
        }
    }
}