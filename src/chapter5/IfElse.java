package chapter5;

public class IfElse {

    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = " Зиме";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Весеа";
        } else if (month == 6 || month == 7 || month == 9) {
            season = "Лету";
        } else if (month == 10 || month == 11 || month == 12) {
            season = "Осени";
        } else {
            season = "Вимыленным месяцам";
        }
        System.out.println(
                "Апрель относится к " + season + "."
        );

    }
}
