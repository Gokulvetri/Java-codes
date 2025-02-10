public class Linearsearch{

    int linearsearch(int arr[],int finder){
        for (int i=0; i< arr.length; i++){
            if(arr[i]== finder)
               return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Linearsearch ls = new Linearsearch();
           int arr[] = {1,2,3,4,5,6,7,8,9};
           int finder = 7;
           int res = ls.linearsearch(arr, finder);

           System.out.println(res);
    }
}