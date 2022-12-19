package homeworks.homework1;

public class IfForExample {

    public static void main(String[] args) {
        //Example 1
        System.out.println("Example 1");
        int a, b, max;
        a = 40;
        b = 15;
        max = a;

        if (a < b) {
            max = b;
        }
        System.out.println("max : " + max);
        System.out.println();

        //Example 2,տպել 15—ի և 30—ի արանքում գտնվող բոլոր թվերը։
        System.out.println("Example 2 ");

        a = 5;
        b = 10;

        for (int z = 0; z < b; z++) {
            if (z > a) {
                System.out.print(z + " ");
            }
        }


        //Example 3,փոխակերպել  m-ի և n-ի արժեքները char-տիպի և տպել։
        System.out.println();
        System.out.println("Example 3");

        char n = 155;
        char m = 165;
        System.out.print(n + " ");
        System.out.println(m);

        //Example 4,
        System.out.println("Example 4");
        a = 5;
        b = 5;

        if (a == b) {
            System.out.println(a + "==" + b);
        }
        if (a != b) {
            System.out.println(a + "!=" + b);
        }


    }
}
