
import java.util.Arrays;

public class MainProgram {
    
    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        //System.out.println(smallest(array));
        //System.out.println(indexOfSmallest(array));
        //System.out.println(indexOfSmallestFrom(array, 2));
        //swap(array, 1, 0);
        sort(array);
    }
    
    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        // write your code here
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int startIndexforSubArray = startIndex;
        int[] subArray = new int[table.length - startIndex];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = table[startIndexforSubArray];
            startIndexforSubArray++;
        }
        return startIndex + indexOfSmallest(subArray);
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temproryValueHolder = array[index1];
        array[index1] = array[index2];
        array[index2] = temproryValueHolder;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
    
}
