package lessons;

public class Main {
    public static void main(String[] args) {
        String value = "XXXIV";
        System.out.println(fromRomanToArabic(value));
    }

    public static Integer fromRomanToArabic(String romanInt) {
        char[] romanArray = romanInt.toCharArray();
        int[] romanIntArray = new int[romanArray.length + 1];
        for (int i = 0; i < romanArray.length; i++) {
            if (romanArray[i] == 'I') {
                romanIntArray[i] = 1;
            } else if (romanArray[i] == 'V') {
                romanIntArray[i] = 5;
            } else if (romanArray[i] == 'X') {
                romanIntArray[i] = 10;
            } else {
                break;
            }
        }

        int res = 0;

        for (int i = 0; i < romanIntArray.length - 1; i++) {
            int currentInt = romanIntArray[i];
            int nextInt = romanIntArray[i + 1];
            if (nextInt > currentInt) {
                res += nextInt - currentInt;
                i++;
            } else {
                res += currentInt;
            }



        }
        return res;
    }
}