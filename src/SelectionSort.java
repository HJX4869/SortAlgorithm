/**
 * 选择排序
 * 不稳定
 * 时间复杂度：平均：O(n^2)；最好：O(n^2)；最坏：O(n^2)
 * 空间复杂的：O(1)
 */
public class SelectionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
