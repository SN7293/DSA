public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where target is found
            }
        }
        return -1; // Return -1 if target is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 56, 78, 34};
        int target = 56;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
