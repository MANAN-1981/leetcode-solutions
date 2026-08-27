// class Solution {
//     public int pivotIndex(int[] arr) {

//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             int left = leftSum(arr, i - 1);
//             int right = rightSum(arr, i + 1, n);

//             if (left == right) {
//                 return i;
//             } 
//         }
//         return -1;
//     }

//     public static int leftSum(int arr[], int index) {
//         int sum = 0;

//         if (index >= 0) {
//             sum = arr[index] + leftSum(arr, index - 1);
//         }
//         return sum;
//     }

//     public static int rightSum(int arr[], int index, int n) {
//         int sum = 0;

//         if (index <= n - 1) {
//             sum = arr[index] + rightSum(arr, index + 1, n);
//         }
//         return sum;
//     }


// static {
//     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//         try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
//             fw.write("0");
//         } catch (Exception e) {
//         }
//     }));
//     }
// }


class Solution {
    public int pivotIndex(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int left = leftSum(arr, i - 1);
            int right = rightSum(arr, i + 1, n);

            if (left == right) {
                return i;
            } 
        }
        return -1;
    }

    public static int leftSum(int arr[], int index) {
        int sum = 0;

        if (index >= 0) {
            sum = arr[index] + leftSum(arr, index - 1);
        }
        return sum;
    }

    public static int rightSum(int arr[], int index, int n) {
        int sum = 0;

        if (index <= n - 1) {
            sum = arr[index] + rightSum(arr, index + 1, n);
        }
        return sum;
    }
}