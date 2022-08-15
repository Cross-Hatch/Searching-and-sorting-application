
// Class for converting string array to integer array
public class StringArrayToIntegerArray {

    // method for converting string array to integer array
    public static int [] method(String array){
        String [] splitArray = array.split(" ");
        int [] integerArray = new int [splitArray.length];

        for (int i = 0; i < splitArray.length; i++){
            integerArray[i] = Integer.parseInt(splitArray[i]);
        }
        return integerArray;
    }

}
