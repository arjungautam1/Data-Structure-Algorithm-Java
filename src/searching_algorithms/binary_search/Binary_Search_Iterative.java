/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-24
 * Time : 10:02
 */
package searching_algorithms.binary_search;

/*Implementation of Binary Search using Iterative approach*/
public class Binary_Search_Iterative {

    int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Binary_Search_Iterative obj = new Binary_Search_Iterative();
        int[] array = {10, 20, 30, 40, 50};
        int x = 20;
        int result = obj.binarySearch(array, x);
        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element preseent at the index :" + result);

    }
}
