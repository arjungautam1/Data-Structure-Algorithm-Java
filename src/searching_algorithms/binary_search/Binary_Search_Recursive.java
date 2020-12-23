/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-22
 * Time : 20:02
 */
package searching_algorithms.binary_search;

/*Implementation of Binary Search in recursive way */
public class Binary_Search_Recursive {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Binary_Search_Recursive binary_search_recursive = new Binary_Search_Recursive();
        int arr[] = {2, 3, 4, 20, 40};
        int n = arr.length;
        int x = 40;
        int result = binary_search_recursive.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element present at index : " + result);
    }
}
