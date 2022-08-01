/**
 * 快速排序
 * 不稳定
 * 时间复杂度：平均：O(n log n)；最好：(n log n)；最坏：(n^2)
 * 空间复杂度：O(log n)
 */
public class QuickSort {
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        int i = left, j = right;
        int pivot = array[i];
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                --j;
            }
            array[i] = array[j];
            while (i < j && array[i] < pivot) {
                ++i;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }
}
