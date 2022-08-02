/**
 * 堆排序
 * 不稳定
 * 时间复杂度：平均：O(n log n)；最好：(n log n)；最坏：(n log n)
 * 空间复杂度：O(1)
 */
public class HeapSort {
    public static void sort(int[] array) {
        int len = array.length;
        for (int i = len / 2 - 1; i >= 0; --i) {
            heapAdjust(array, i, len);
        }
        for (int j = len - 1; j >= 0; --j) {
            swap(array, 0, j);
            heapAdjust(array, 0, j);
        }
    }

    private static void heapAdjust(int[] array, int node, int len) {
        int left = 2 * node + 1;
        int right = 2 * node + 2;
        int max = node;
        if (left < len && array[max] < array[left]) {
            max = left;
        }
        if (right < len && array[max] < array[right]) {
            max = right;
        }
        if (max != node) {
            swap(array, max, node);
            heapAdjust(array, max, len);
        }
    }

    private static void swap(int[] array, int x, int y) {
        int change = array[x];
        array[x] = array[y];
        array[y] = change;
    }
}
