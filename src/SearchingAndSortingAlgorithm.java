import static Algorithms.SearchingAlgorithms.linearSearch;
import static Algorithms.SortingAlgorithms.bubbleSort;
import static Algorithms.SortingAlgorithms.selectionSort;

// This class is responsible for handling the searching and sorting
public class SearchingAndSortingAlgorithm {

    //      SORTING OF ARRAYS
    SearchingAndSortingAlgorithm(String algorithm, int [] array){
        switch (algorithm){
            case "bubblesort" -> {
                bubbleSort(array);
                for (int j : array) {
                    System.out.print(j + " ");
                }
            }
            case "selectionsort" -> {
                selectionSort(array);
                for (int j : array) {
                    System.out.print(j + " ");
                }
            }
        }
    }

    //  SEARCHING THROUGH ARRAYS
    SearchingAndSortingAlgorithm(String algorithm, int  [] array, int searchNumber){
        switch (algorithm) {
            case "linearsearch" -> {
                int index = linearSearch(array, searchNumber);
                if (index != -1) {
                    System.out.println("Element is at index: " + index);
                } else {
                    System.out.println("Element not found");
                }
            }
        }
    }

}
