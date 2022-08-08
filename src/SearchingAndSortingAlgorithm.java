import static Algorithms.SearchingAlgorithms.linearSearch;
import static Algorithms.SortingAlgorithms.bubbleSort;
import static Algorithms.SortingAlgorithms.selectionSort;

public class SearchingAndSortingAlgorithm {

    //      SORTING
    SearchingAndSortingAlgorithm(String algorithm, int [] array){
        if (algorithm.equalsIgnoreCase("bubbleSort")){
            bubbleSort(array);
            for (int j : array) {
                System.out.print(j + " ");
            }
        }else if (algorithm.equalsIgnoreCase("selectionSort")){
            selectionSort(array);
            for (int j : array) {
                System.out.print(j + " ");
            }
        }
    }

    //  SEARCHING
    SearchingAndSortingAlgorithm(String algorithm, int  [] array, int searchNumber){
        if(algorithm.equalsIgnoreCase("linearSearch")){
            int index = linearSearch(array, searchNumber);
            if (index != -1){
                System.out.println("Element is at index: " + index);
            }else {
                System.out.println("Element not found");
            }
        }
    }

    SearchingAndSortingAlgorithm(String algorithm, String  [] array){
    }
}
