package homeworks.homework8;

public class DynamicArray {

    int[] array = new int[10];
    int size;

    public void add(int value) {
        if (size >= array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    public int getByIndex(int index) {
        if (index < array.length) {
            return array[index];
        } else {
            return -1;
        }
    }


    void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }


}

