import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {
        System.out.println(multiply(2, 4));
        System.out.println(concat("ciao", 3));
        System.out.println(Arrays.toString(insertArray(new String[]{"uno", "due", "tre", "quattro", "cinque"}, "zero")));
    }

    public static String concat(String str, int x) {
        return str + x;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static String[] insertArray(String[] strArr, String str) {
        String[] newArr = new String[6];

        for (int i = 0; i < newArr.length; i++) {
            if (i < 3) newArr[i] = strArr[i];
            else if (i == 3) newArr[i] = str;
            else newArr[i] = strArr[i - 1];
        }
        return newArr;
    }
}


