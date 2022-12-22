package homeworks.homework2;

public class FigurePainter2 {

    public static void main(String[] args) {


        //****
        // ***
        //  **
        //   *


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int n = 4; n > i; n--) {
                System.out.print("* ");
            }
            System.out.println();


        }

        /*
           *
          ***
         *****
        *******
       */


        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int n = 0; n < 2 * i -1; n++) {
                System.out.print("*");
            }
            System.out.println();

        }

        /*
         *******
          *****
           ***
            *
         */

        for (int i = 5; i >= 0 ; i--) {
            for (int j = i; j <= 5 ; j++) {
                System.out.print(" ");
            }
            for (int n = 2 * i-1; n > 0 ; n--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }


}
