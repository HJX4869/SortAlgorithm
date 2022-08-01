/**
 * 插入排序
 * 稳定
 * 时间复杂度：平均：O(n^2)；最好：O(n)；最坏：O(n^2)
 * 空间复杂度：O(1)
 */
public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int preIndex = i - 1;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
    }
}
