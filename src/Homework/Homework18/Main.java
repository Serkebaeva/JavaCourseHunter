package Homework.Homework18;


import java.util.Arrays;

public class Main {
    public void arraySort(int[] array) {
        int temp;
        int start = 0;
        int end = array.length -1;

        while(start < end) {
            for(int i = start; i < end; i++) {
                if(array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            end--;
        }
    }

    public static void main(String[] args) {
        Main test = new Main();
        int array[] = {1, 9, 3, -8, 0, 5, 4, 1};
        System.out.println("Given  Array: "+ Arrays.toString(array));
        test.arraySort(array);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
        int array2[] = {-11, 19, 233, -8, 0, 25, 34, 1, 14, 76};
        System.out.println("Given  Array: "+ Arrays.toString(array2));
        test.arraySort(array2);
        System.out.println("Sorted Array: "+ Arrays.toString(array2));

    }
}


