package homeworks.homework8;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();

        dy.add(7);
        dy.add(65);
        dy.add(48);
        dy.add(3);
        dy.add(69);
        dy.add(7);
        dy.add(11);
        dy.add(99);
        dy.add(0);
        dy.add(8);
        dy.add(55);
        dy.add(44);
        dy.add(77);
        dy.add(69);
        dy.print();
        int elementByIndex = dy.getByIndex(18);
        System.out.println("Element by index = " + elementByIndex);
    }
}
