/**
 * 冒泡排序
 * 稳定
 * 时间复杂度：O(n^2)--平均；最好：O(n)；最坏：O(n^2)
 * 空间复杂度：O(1)
 */
public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
