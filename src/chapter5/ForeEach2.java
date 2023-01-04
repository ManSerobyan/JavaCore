package chapter5;

public class ForeEach2 {

    public static void main(String[] args) {
        int sum = 0;
        int numbs[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : numbs) {
            System.out.println("Значение равно: " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println(sum);

      }
}
