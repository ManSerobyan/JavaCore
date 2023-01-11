package homeworks.homework6;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] array = {11, 72, 13, 4, 5, 6, 47, 8, 9, 10};
        ArrayUtil arrayUtil = new ArrayUtil();

        arrayUtil.arrayUtilElements(array);
        arrayUtil.arrayUtilMaxMin(array);
        arrayUtil.firstLastAndMiddleElement(array);
        arrayUtil.arrayUtilCountCouple(array);
        arrayUtil.arrayUtilCountOdd(array);
        arrayUtil.arrayUtilSum(array);

    }
}
