import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        boolean status = true;

        while (status){
            try{
                System.out.println();
                System.out.print("""
                        Enter an array of numbers separated by single space only. Press Q to quit
                        >\040""");
                String input = userInput.nextLine();

                if (!input.equalsIgnoreCase("Q")) {

                    // Changes user array from string array to integer array
                    int[] array = StringArrayToIntegerArray.method(input);

                    System.out.print("""
                            \nSelect a number below
                            1. Sorting Algorithms
                            2. Searching Algorithms
                            Q to quit
                            >\040""");

                    String selectedInput = userInput.nextLine().toLowerCase();

                    switch (selectedInput) {

                        //  Sorting of array
                        case "one", "1" -> {
                            System.out.print("""
                                    \nSelect your preferred sorting algorithm
                                    1. Bubble sort
                                    2. Selection sort
                                    3. Merge sort
                                    4. Quick sort
                                    >\040""");
                            String algoSelected = userInput.nextLine().trim();

                            if (algoSelected.equals("1") || algoSelected.equals("2") || algoSelected.equals("3")
                                    || algoSelected.equals("4"))
                            {
                                new SearchingAndSortingAlgorithm(algoSelected, array);
                            } else {
                                System.out.println("Sorry, sorting algorithm not found!");
                            }

                        }

                        //  Searching through array
                        case "two", "2" -> {
                            System.out.print("""
                                    \nSelect your preferred searching algorithm " +
                                    "1. Linear search" +
                                    "2. Binary search
                                    >\040""");
                            String algoSelected = userInput.nextLine().trim();

                            if (algoSelected.equals("1") || algoSelected.equals("2")) {
                                System.out.print("""
                                        \nEnter a key to search for it.
                                        >\040""");
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