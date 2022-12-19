package homeworks.homework1;

public class FigurePainter {

    public static void main(String[] args) {

        //Figure 1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();


        //Figure 2
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int m = 5; m > i - 1; m--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Figure 3
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = i; j <= n; j++) {
                System.out.print(" * ");
            }
        }

    }
}
