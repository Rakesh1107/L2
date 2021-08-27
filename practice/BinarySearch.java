package practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 9, 6, 3, 10};
        System.out.println(binarySearch(array, 6));
    }

    private static int binarySearch(int[] array, int a) {
        return binarySearch(array, 0, array.length-1, a);
    }

    private static int binarySearch(int[] array, int l, int r, int a) {
        if (r >= l) {
            int mid = (l+r)/2;

            if (array[mid] == a) {
                return mid;
            }
            if (array[mid] > a) {
                return binarySearch(array, l, mid-1, a);
            }
            else if (array[mid] < a) {
                return binarySearch(array, mid+1, r, a);
            }
        }
        return -1;
    }
}
