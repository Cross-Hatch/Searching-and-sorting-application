public class StringArrayToIntegerArray {

    public static int [] method(String array){
        String [] splitArray = array.split(" ");
        int [] integerArray = new int [splitArray.length];

        for (int i = 0; i < splitArray.length; i++){
            integerArray[i] = Integer.parseInt(splitArray[i]);
        }
        return integerArray;
    }

}
