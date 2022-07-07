import java.util.*;

public class ReverseArray {
    public static int[] reverse(int[] array){
        int temp;
        for (int i = 0; i < (array.length / 2); i++) {
        temp = array[i];
        array[i] = array[array.length-1-i];
        array[array.length-1-i] = temp;
        }
    return array;}
}


class Test {

    public static void main(String[] args) {
        int[] a = ReverseArray.reverse(new int[]{1,2,3,4,5,6});
        System.out.println(Arrays.toString(a));
    }
}
