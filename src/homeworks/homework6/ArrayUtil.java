package homeworks.homework6;

public class ArrayUtil {

    void arrayUtilElements(int [] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

    }

    void arrayUtilMaxMin(int[] array) {

        int max = array[0];
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
            }
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);

        System.out.println();

    }

    void firstLastAndMiddleElement(int[] array) {

        System.out.println("last element: " + array[array.length - 1]);

        System.out.println("first element: " + array[0]);

        System.out.println("middle element: " + array[array.length / 2]);

        System.out.println();

    }

    void arrayUtilCountCouple(int[] array) {

        int countCouple = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                countCouple++;
            }
        }
        System.out.println();
        System.out.println("Count Couple = " + countCouple);

        System.out.println();
    }

    void arrayUtilCountOdd(int[] array) {

        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
                countOdd++;
            }

        }
        System.out.println();
        System.out.println("Count Odd = " + countOdd);

        System.out.println();

    }

    void arrayUtilSum(int [] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);

        System.out.println("The arithmetic average = " + sum / array.length);


    }
}
