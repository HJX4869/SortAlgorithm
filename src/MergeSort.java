import java.util.Arrays;

/**
 * 归并排序
 * 稳定
 * 时间复杂度：平均：O(n log n)；最好：(n log n)；最坏：(n log n)
 * 空间复杂度：O(n)
 */
public class MergeSort {
    public static void sort(int[] array) {
        int[] temp = new int[array.length];
        mergeSort(array, temp, 0, array.length);
    }

    private static void mergeSort(int[] array, int[] temp, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(array, temp, left, mid);
            mergeSort(array, temp, mid, right);
            mergeAdd(array, temp, left, mid, right);
        }
    }

    private static void mergeAdd(int[] array, int[] temp, int left, int mid, int right) {
        for (int index = left, i = left, j = mid; index < right; ++index) {
            if (i >= mid || (j < right && array[i] > array[j])) {
                temp[index] = array[j++];
            } else {
                temp[index] = array[i++];
            }
        }
        System.arraycopy(temp, left, array, left, right - left);
    }
}
