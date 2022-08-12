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
                        case "one", "1" -> {
                            System.out.println("Enter sorting algorithm preferred");
                            String algoSelected = userInput.nextLine().trim().toLowerCase();

                            if (algoSelected.equals("bubblesort") || algoSelected.equals("selectionsort")) {
                                new SearchingAndSortingAlgorithm(algoSelected, array);
                            } else {
                                System.out.println("Sorry, sorting algorithm not found!");
                            }

                        }
                        case "two", "2" -> {
                            System.out.println("Enter searching algorithm preferred");
                            String algoSelected = userInput.nextLine().trim().toLowerCase();

                            if (algoSelected.equals("linearsearch")) {
                                System.out.println("Enter number to search for");
                                int number = userInput.nextInt();
                                new SearchingAndSortingAlgorithm(algoSelected, array, number);
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