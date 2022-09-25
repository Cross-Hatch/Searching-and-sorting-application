import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        boolean status = true;
        System.out.println("Would you like to change the array later during runtime?\n1 Yes\n2 No");
        String choice = userInput.nextLine().trim();

        if (choice.equals("1")){
            while (status){
                try{
                    System.out.println();
                    System.out.println("Enter array of numbers separated by single space only or Q to quit");
                    String input = userInput.nextLine().trim();

                    if (!input.equalsIgnoreCase("Q")) {

                        // Changes user array from string array to integer array
                        int[] array = StringArrayToIntegerArray.method(input);

                        System.out.print("Enter\n1 for sorting\n2 for searching\nQ to quit: ");
                        String selectedInput = userInput.nextLine().toLowerCase();

                        switch (selectedInput) {

                            //  Sorting of array
                            case "one", "1" -> {
                                System.out.println("""
                                    Select sorting algorithm preferred
                                    Bubble sort: 1
                                    Selection sort: 2
                                    Merge sort: 3
                                    Quick sort: 4
                                    Insertion sort: 5
                                    Shell sort: 6
                                    Radix sort: 7""");
                                String algoSelected = userInput.nextLine().trim();

                                if (algoSelected.equals("1") || algoSelected.equals("2") || algoSelected.equals("3")
                                        || algoSelected.equals("4") || algoSelected.equals("5")
                                        || algoSelected.equals("6") || algoSelected.equals("7"))
                                {
                                    try {
                                        new SearchingAndSortingAlgorithm(algoSelected, array);
                                    }
                                    catch (ArrayIndexOutOfBoundsException exception) {
                                        System.out.println("For now, array should contain positive numbers only for radix sort");
                                    }
                                } else {
                                    System.out.println("Sorry, sorting algorithm not found!");
                                }

                            }

                            //  Searching through array
                            case "two", "2" -> {
                                System.out.println("""
                                        Select searching algorithm preferred
                                        Linear search: 1
                                        Binary search: 2""");
                                String algoSelected = userInput.nextLine().trim();

                                if (algoSelected.equals("1") || algoSelected.equals("2")) {
                                    System.out.println("Enter key to search for");
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
        } else if (choice.equals("2")) {

            System.out.println();
            System.out.println("Enter array of numbers separated by single space only or Q to quit");
            String input = userInput.nextLine().trim();

            while (status){
                try{

                    if (!input.equalsIgnoreCase("Q")) {

                        // Changes user array from string array to integer array
                        int[] array = StringArrayToIntegerArray.method(input);

                        System.out.println();
                        System.out.print("Enter\n1 for sorting\n2 for searching\nQ to quit: ");
                        String selectedInput = userInput.nextLine().toLowerCase();

                        switch (selectedInput) {

                            //  Sorting of array
                            case "one", "1" -> {
                                System.out.println("""
                                    Select sorting algorithm preferred
                                    Bubble sort: 1
                                    Selection sort: 2
                                    Merge sort: 3
                                    Quick sort: 4
                                    Insertion sort: 5
                                    Shell sort: 6
                                    Radix sort: 7""");
                                String algoSelected = userInput.nextLine().trim();

                                if (algoSelected.equals("1") || algoSelected.equals("2") || algoSelected.equals("3")
                                        || algoSelected.equals("4") || algoSelected.equals("5")
                                        || algoSelected.equals("6") || algoSelected.equals("7"))
                                {
                                    try {
                                        new SearchingAndSortingAlgorithm(algoSelected, array);
                                    }
                                    catch (ArrayIndexOutOfBoundsException exception) {
                                        System.out.println("For now, array should contain positive numbers only for radix sort");
                                    }
                                } else {
                                    System.out.println("Sorry, sorting algorithm not found!");
                                }

                            }

                            //  Searching through array
                            case "two", "2" -> {
                                System.out.println("""
                                        Select searching algorithm preferred
                                        Linear search: 1
                                        Binary search: 2""");
                                String algoSelected = userInput.nextLine().trim();

                                if (algoSelected.equals("1") || algoSelected.equals("2")) {
                                    System.out.println("Enter key to search for");
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
        }else {
            System.out.println("Invalid choice");
        }

    }
}