public class SortingChecker {
     static Boolean sortCheck(int []arr){
        int n = arr.length;
        for (int i=1 ; i < n ; i++){
            if (arr[i-1]> arr [i]){
                return false;
            }
        }  
        return true;  
    }

    public static void main(String[] args) {
        int []arr = {5,4,7,6,9,8};

        Boolean result =  SortingChecker.sortCheck(arr);

        if (result == true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted Array");
        }
    }
}
