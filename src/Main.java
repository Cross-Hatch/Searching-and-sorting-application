import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter array");
        String input = userInput.nextLine();

        int [] array = StringArrayToIntegerArray.method(input);

        System.out.print("Enter 1 for sorting or 2 for searching: ");
        String selectedInput = userInput.nextLine();

        if(selectedInput.equalsIgnoreCase("one") || selectedInput.equals("1")){
            System.out.println("Enter sorting algorithm preferred");
            String algoSelected = userInput.nextLine().trim();
            if (algoSelected.equalsIgnoreCase("bubbleSort") || algoSelected.equalsIgnoreCase("selectionSort")){
                new SearchingAndSortingAlgorithm(algoSelected, array);
            }else {
                System.out.println("Sorry, sorting algorithm not found!");
            }
        } else if (selectedInput.equalsIgnoreCase("two") || selectedInput.equals("2")) {
            System.out.println("Enter searching algorithm preferred");
            String algoSelected = userInput.nextLine();
            System.out.println("Enter number to search for");
            int number = userInput.nextInt();
            new SearchingAndSortingAlgorithm(algoSelected, array, number);
        }else{
            System.out.println("Oops! Invalid input");
        }

    }
}