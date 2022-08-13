import static Algorithms.SearchingAlgorithms.*;
import static Algorithms.SortingAlgorithms.*;

// This class is responsible for handling the searching and sorting
public class SearchingAndSortingAlgorithm {

    //      SORTING OF ARRAYS
    SearchingAndSortingAlgorithm(String algorithm, int [] array){
        switch (algorithm){
            case "1" -> {
                bubbleSort(array);
                for (int j : array) {
                    System.out.print(j + " ");
                }
            }
            case "2" -> {
                selectionSort(array);
                for (int j : array) {
                    System.out.print(j + " ");
                }
            }
            case "3" -> {
                mergeSort(array);
                for (int j: array){
                    System.out.print(j + " ");
                }
            }
            case "4" -> {
                quickSort(array, 0, array.length - 1);
                for (int j: array){
                    System.out.print(j + " ");
                }
            }
        }
    }

    //  SEARCHING THROUGH ARRAYS
    SearchingAndSortingAlgorithm(String algorithm, int  [] array, int searchNumber){
        switch (algorithm) {
            case "1" -> {
                int index = linearSearch(array, searchNumber);
                if (index != -1) {
                    System.out.println("Element is at index: " + index);
                } else {
                    System.out.println("Element not found");
                }
            }
            case "2" -> {
                int index = binarysearch(array, searchNumber);
                if (index == -1) {
                    System.out.println("Element not found");
                } else {
                    System.out.println("Element found at index " + index);
                }
            }
        }
    }

}
