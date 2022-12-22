package homeworks.homework2;

public class ArrayUtil {

    public static void main(String[] args) {
        int [] array = {11, 72, 13, 4, 5, 6, 47, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int max = array[0];
        int min = array[0];
        for  (int j = 1; j < array.length; j++) {
           if (max < array[j]) {
               max = array[j];
            }
           if (array[j] < min) {
               min = array[j];
           }
        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);


        }
    }


