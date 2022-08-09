import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);

        int [] aa = {3, 5, 1 , 8, 7, 2, 91, 2};

        System.out.print("Enter 1 for searching or 2 for sorting: ");
        String selectedInput = userInput.nextLine();

        if(selectedInput.equalsIgnoreCase("one") || selectedInput.equals("1")){
            System.out.println("Enter sorting algorithm preferred");
            String algoSelected = userInput.nextLine().trim();
            if (algoSelected.equalsIgnoreCase("bubbleSort") || algoSelected.equalsIgnoreCase("selectionSort")){
                new SearchingAndSortingAlgorithm(algoSelected, aa);
            }else {
                System.out.println("Sorry, sorting algorithm not found!");
            }
        } else if (selectedInput.equalsIgnoreCase("two") || selectedInput.equals("2")) {
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