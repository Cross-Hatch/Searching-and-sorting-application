package Algorithms;

public class SearchingAlgorithms {

    public static int linearSearch(int [] array, int value){

        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    // Works for sorted arrays
    public static int binarysearch(int [] array, int value){

        int low = 0;
        int high = array.length -1;

        while (low <= high){
            int middle = low + (high - low) / 2;
            int target = array[middle];

            if(target < value) { low = middle + 1;}
            else if (target > value){ high = middle - 1;}
            else{ return middle;}
        }
        return -1;
    }

}
