package homeworks.homework1;

public class IfForExample {

    public static void main(String[] args) {
        int a, b;
        a = 15;
        b = 8;

        if (a < b) {
            System.out.println("max: " + b);
        } else
            System.out.println("max: " + a);


        for (int i = b; i < a; i++) {
                System.out.print(i + " " );
        }

        System.out.println((char) a);
        System.out.println((char) b);


        if (a == b) {
            System.out.println(" a " + "==" + " b ");
        }
        else  {
            System.out.println(" a " + "!=" + " b ");
        }


    }
}
