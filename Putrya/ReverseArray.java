public class ReverseArray {
    public static int[] reverse(int[] array){
        int temp;
        for (int i = 0; i < (array.length / 2); i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        } return array;
    }
}


