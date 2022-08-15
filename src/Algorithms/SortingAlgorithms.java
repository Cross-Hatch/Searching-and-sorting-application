package Algorithms;

public class SortingAlgorithms {
    public static void shellSort(int [] array){
        for (int gap = array.length / 2; gap > 0; gap /= 2){

            for (int i = gap; i < array.length; i++){
                int newValue = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > newValue){
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newValue;
            }
        }
    }

    public static void insertionSort(int [] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void bubbleSort(int [] array){
        for (int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
            }
        }
    }

    public static void selectionSort(int [] array){

        for(int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }

    public static void mergeSort(int [] array){
        int length = array.length;
        if(length <= 1) return;
        int middle = length / 2;
        int [] leftArray = new int[middle];
        int [] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for (; i < length; i++){
            if (i < middle){
                leftArray[i] = array[i];
            }else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private static void merge(int [] leftArray, int [] rightArray, int [] array){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void quickSort(int [] array, int start, int end){

        if (end < start) return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    public static int partition(int [] array, int start, int end){

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++){
            if (array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
