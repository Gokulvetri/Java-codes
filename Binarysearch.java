public class Binarysearch {
    int binarysearch(int arr[], int finder) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {  // Change from left < right to left <= right
            int mid = left + (right - left) / 2;

            if (arr[mid] == finder)
                return mid;

            if (arr[mid] < finder)
                left = mid + 1;  // Corrected this line
            else
                right = mid - 1;
        }
        return -1;
    }

    int recursivebinarysearch(int arr[], int left, int right, int finder) {
        if (left > right)  // Fixed the base condition
            return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == finder)
            return mid;
        else if (arr[mid] < finder)
            return recursivebinarysearch(arr, mid + 1, right, finder);
        else
            return recursivebinarysearch(arr, left, mid - 1, finder);
    }

    public static void main(String[] args) {
        Binarysearch search = new Binarysearch();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int finder = 7;

        int res = search.binarysearch(arr, finder);
        if (res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + res);
        }

        int left = 0;
        int right = arr.length - 1;

        int res1 = search.recursivebinarysearch(arr, left, right, finder);
        if (res1 == -1) {
            System.out.println("Element not found by recursive search");
        } else {
            System.out.println("Element found by recursive search at index " + res1);
        }
    }
}
