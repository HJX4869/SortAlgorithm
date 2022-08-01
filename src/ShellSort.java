/**
 * 希尔排序
 * 不稳定
 * 时间复杂度：平均：O(n log n)；最好：(n log n)；最坏：(n log n)
 * 空间复杂度：O(1)
 */
public class ShellSort {
    public static void sort(int[] array) {
        int gap = array.length / 2;
        while (gap > 0) {
            for (int i = gap; i < array.length; i += gap) {
                int current = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && current < array[preIndex]) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = current;
            }
            gap /= 2;
        }
    }
}
