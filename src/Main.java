import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        boolean status = true;

        while (status){
            try{
                System.out.println();
                System.out.println("Enter array of numbers separated by single space only or Q to quit");
                String input = userInput.nextLine();

                if (!input.equalsIgnoreCase("Q")) {

                    // Changes user array from string array to integer array
                    int[] array = StringArrayToIntegerArray.method(input);

                    System.out.print("Enter\n1 for sorting\n2 for searching\nQ to quit: ");
                    String selectedInput = userInput.nextLine().toLowerCase();

                    switch (selectedInput) {

                        //  Sorting of array
                        case "one", "1" -> {
                            System.out.println("Select sorting algorithm preferred\nBubble sort: 1\nSelection sort: 2");
                            String algoSelected = userInput.nextLine().trim().toLowerCase();

                            if (algoSelected.equals("1") || algoSelected.equals("2")) {
                                new SearchingAndSortingAlgorithm(algoSelected, array);
                            } else {
                                System.out.println("Sorry, sorting algorithm not found!");
                            }

                        }

                        //  Searching through array
                        case "two", "2" -> {
                            System.out.println("Select searching algorithm preferred\nLinear search: 1\nBinary search: 2");
                            String algoSelected = userInput.nextLine().trim().toLowerCase();

                            if (algoSelected.equals("1") || algoSelected.equals("2")) {
                                System.out.println("Enter number to search for");
                                int number = userInput.nextInt();
                                new SearchingAndSortingAlgorithm(algoSelected, array, number);
                                userInput.nextLine();
                            } else {
                                System.out.println("Sorry, searching algorithm not found!");
                            }

                        }
                        case "q" -> {
                            status = false;
                            System.out.println("Have a nice day!");
                        }
                        default -> System.out.println("Oops! Invalid input");
                    }
                }else {
                    status = false;
                    System.out.println("Have a nice day!");
                }
            }catch (NumberFormatException exception){
                System.out.println("Invalid input");
            }
        }

    }
}