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
                    int[] array = StringArrayToIntegerArray.method(input);

                    System.out.print("Enter 1 for sorting or 2 for searching or Q to quit: ");
                    String selectedInput = userInput.nextLine();

                    if (selectedInput.equalsIgnoreCase("one") || selectedInput.equals("1")) {
                        System.out.println("Enter sorting algorithm preferred");
                        String algoSelected = userInput.nextLine().trim();

                        if (algoSelected.equalsIgnoreCase("bubbleSort") || algoSelected.equalsIgnoreCase("selectionSort")) {
                            new SearchingAndSortingAlgorithm(algoSelected, array);
                        } else {
                            System.out.println("Sorry, sorting algorithm not found!");
                        }

                    } else if (selectedInput.equalsIgnoreCase("two") || selectedInput.equals("2")) {
                        System.out.println("Enter searching algorithm preferred");
                        String algoSelected = userInput.nextLine();

                        if (algoSelected.equalsIgnoreCase("linearSearch")) {
                            System.out.println("Enter number to search for");
                            int number = userInput.nextInt();
                            new SearchingAndSortingAlgorithm(algoSelected, array, number);
                        } else {
                            System.out.println("Sorry, searching algorithm not found!");
                        }

                    } else if (selectedInput.equalsIgnoreCase("q")) {
                        status = false;
                        System.out.println("Have a nice day!");
                    } else {
                        System.out.println("Oops! Invalid input");
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