import java.util.Stack;

public class IterativeQuicksort {
    public static void sort(int[] arr) {
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{0, arr.length - 1});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int low = range[0];
            int high = range[1];

            if (low < high) {
                int pi = partition(arr, low, high);

                if (pi - 1 > low) {  
                    stack.push(new int[]{low, pi - 1});
                }

                if (pi + 1 < high) {  
                    stack.push(new int[]{pi + 1, high});
                }
            }
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 6, 9, 8, 1};
        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
