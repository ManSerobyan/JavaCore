package homeworks.homework5;

public class ArraySpaceExample {

    void trim(char[] array) {

            int startIndex = 0;
            int endIndex = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == ' ') {
                    startIndex++;
                } else {
                    break;
                }

            }
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == ' ') {
                    endIndex--;
                }else {
                    break;
                }
            }

          char[] result = new char [(endIndex -startIndex) + 1];
            int j = 0;
        for (int i = startIndex; i <= endIndex ; i++) {
            result[j++] =array[i];

        }
         for (char c :result){
             System.out.print(c);
         }
        }

    }

