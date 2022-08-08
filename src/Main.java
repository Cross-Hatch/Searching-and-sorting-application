import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);

        int [] aa = {3, 5, 1 , 8, 7, 2, 91, 2};

        System.out.println("Searching or sorting: ");
        String selectedInput = userInput.nextLine();

        if(selectedInput.equalsIgnoreCase("Sorting")){
            System.out.println("Enter sorting algorithm preferred");
            String algoSelected = userInput.nextLine();
            new SearchingAndSortingAlgorithm(algoSelected, aa);
        } else if (selectedInput.equalsIgnoreCase("Searching")) {
            System.out.println("Enter searching algorithm preferred");
            String algoSelected = userInput.nextLine();
            System.out.println("Enter number to search for");
            int number = userInput.nextInt();
            new SearchingAndSortingAlgorithm(algoSelected, aa, number);
        }else{
            System.out.println("Oops! Invalid input");
        }

    }

}