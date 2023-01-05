package chapter5;

public class Search {

    public static void main(String[] args) {
        int numbs[] = {6, 9, 2, 1, 4, 7, 8, 5};
        int val = 4;
        boolean found = false;

        for (int x : numbs) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found) ;
        System.out.println("Значение найдено!");
    }
}
