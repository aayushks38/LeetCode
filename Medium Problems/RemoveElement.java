public class RemoveElement {

    public static int removeElement(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            if (arr[low] == val) {
                swap(arr, low, high);
                high--;
            } else {
                low++;
            }
        }

        return high + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = removeElement(arr, val);

        System.out.println("k = " + k);

        System.out.print("Valid elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}